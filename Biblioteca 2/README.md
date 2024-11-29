# Fazer alteracao no BD

– Alteracoes no BD
ALTER TABLE multa ADD COLUMN data_ultima_atualizacao DATE DEFAULT CURRENT_DATE;

CREATE OR REPLACE FUNCTION atualizar_multas()
RETURNS void AS $$
BEGIN
    UPDATE multa
    SET valor_atual = valor_atual + (taxa_diaria * (CURRENT_DATE - data_ultima_atualizacao)),
        data_ultima_atualizacao = CURRENT_DATE
    WHERE CURRENT_DATE > data_ultima_atualizacao;
END;
$$ LANGUAGE plpgsql;

SELECT atualizar_multas();

