
CREATE TABLE material (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    fabricacao VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    comissao DECIMAL(10, 2) NOT NULL,
    estoque BIGINT(20) NOT NULL
    
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO material VALUES (0, 'Cerâmica dior', 'ceramix', 'kp4040', 
'usada para brilhar no sol e refletir na terra', 'Cerâmica', 'Casa', 'Nacional',
'12.00', '5.00', '700');



	