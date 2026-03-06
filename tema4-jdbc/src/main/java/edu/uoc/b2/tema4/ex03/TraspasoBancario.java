package edu.uoc.b2.tema4.ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ============================================================
 * EXERCICI 03 JDBC / EJERCICIO 03 JDBC — Transacciones / Transaccions ⭐⭐⭐⭐
 * ============================================================
 *
 * [CAT] OBJECTIU: Controlar l'execució d'un traspàs de diners mitjançant
 * transaccions manuals (commit/rollback).
 * [ES] OBJETIVO: Controlar la ejecución de un traspaso de dinero mediante
 * transacciones manuales (commit/rollback).
 */
public class TraspasoBancario {

    /**
     * [CAT] Realitza un traspàs bancari assecurant l'A de ACID (Atomicitat).
     * [ES] Realiza un traspaso bancario asegurando la A de ACID (Atomicidad).
     *
     * @param conn      Connection (s'ha d'establir a autoCommit=false manualment /
     *                  se debe establecer a autoCommit=false manualmente)
     * @param origenId  ID de la cuenta origen
     * @param destinoId ID de la cuenta destino
     * @param cantidad  Dinero a traspasar (> 0)
     * @throws SQLException si falla alguna cosa (incloent falta de saldo) / si
     *                      falla algo (incluyendo falta de saldo)
     */
    public static void traspasar(Connection conn, int origenId, int destinoId, double cantidad) throws SQLException {
        // [ES] TODO —
        // 1. Quitar el autoCommit de la conexión (false).
        // 2. Comprobar que cantidad > 0.
        // 3. Ejecutar UPDATE restando el saldo de la id de origen.
        // ¡OJO! Si no hay saldo (o no existe la cuenta origen o su saldo < cantidad),
        // lanzar SQLException ("No hay saldo suficiente").
        // 4. Ejecutar UPDATE sumando el saldo a la id de destino.
        // 5. Si todo ha ido bien, hacer commit().
        // 6. Usar catch o finally para hacer rollback() si ha saltado un error.
        // 7. Volver a activar autoCommit (true) al terminar.
        //
        // [CAT] TODO —
        // 1. Treure l'autoCommit de la connexió (false).
        // 2. Comprovar que cantidad > 0.
        // 3. Executar UPDATE restant el saldo de la id d'origen.
        // ULL! Si no hi ha saldo (o no existeix el compte origen o saldo < cantidad),
        // llançar SQLException ("No hi ha prou saldo").
        // 4. Executar UPDATE sumant el saldo a la id de destí.
        // 5. Si tot ha anat bé, fer commit().
        // 6. Usar catch o finally per fer rollback() si ha saltat un error.
        // 7. Tornar a activar autoCommit (true) en acabar.

        throw new UnsupportedOperationException("TODO");
    }
}
