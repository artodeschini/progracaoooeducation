CREATE  TABLE IF NOT EXISTS `Cidade` (
  `idCidade` INT NOT NULL AUTO_INCREMENT ,
  `nmCidade` VARCHAR(45) NOT NULL ,
  `sgEstado` VARCHAR(2) NOT NULL ,
  PRIMARY KEY (`idCidade`) )
ENGINE = InnoDB;

DELIMITER $$
DROP PROCEDURE IF EXISTS `listar_cidades_UF` $$
CREATE PROCEDURE `listar_cidades_UF`(IN _uf varchar(2))
BEGIN
      IF (_uf IS NULL) THEN

        SELECT c.idcidade, c.nmcidade, c.sgestado
        FROM encidade c;

      ELSE

        SELECT c.idcidade, c.nmcidade, c.sgestado
        FROM encidade c
        where sgestado = _uf;

      END IF;

   END $$
DELIMITER ;