package edu.uoc.b2.tema3;

import java.sql.*;
import java.util.*;

/**
 * ============================================================
 * EXERCICIS SQL / EJERCICIOS SQL — Tema 3
 * ============================================================
 *
 * [CAT] INSTRUCCIONS GENERALS:
 *  - En aquest tema NOMÉS has d'escriure la consulta SQL dins de la variable `sql`.
 *  - El codi JDBC ja està implementat per tu, no el modifiquis.
 *  - Les consultes han de funcionar amb H2 (compatibles amb MySQL).
 *
 * [ES]  INSTRUCCIONES GENERALES:
 *  - En este tema SOLO tienes que escribir la consulta SQL dentro de la variable `sql`.
 *  - El código JDBC ya está implementado por ti, no lo modifiques.
 *  - Las consultas deben funcionar con H2 (compatibles con MySQL).
 */
public class ConsultasSQL {

    // ──────────────────────────────────────────────────────────
    //  EJERCICIO 1 / EXERCICI 1 ⭐ — SELECT bàsic / básico
    // ──────────────────────────────────────────────────────────

    /**
     * [CAT] Retorna els noms de tots els clients, ordenats alfabèticament.
     * [ES]  Devuelve los nombres de todos los clientes, ordenados alfabéticamente.
     */
    public static List<String> ex1_nombresClientes(Connection conn) throws SQLException {
        // [ES]  TODO — Escribe la consulta SQL para obtener el campo 'nom' de la tabla 'clients' ordenado ascendentemente.
        // [CAT] TODO — Escriu la consulta SQL per obtenir el camp 'nom' de la taula 'clients' ordenat ascendentment.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                list.add(rs.getString("nom"));
            }
        }
        return list;
    }

    /**
     * [CAT] Retorna el nombre total de productes a la base de dades.
     * [ES]  Devuelve el número total de productos en la base de datos.
     */
    public static int ex1_totalProductos(Connection conn) throws SQLException {
        // [ES]  TODO — Cuenta cuántos registros completos (COUNT(*)) hay en la tabla 'productes'.
        // [CAT] TODO — Compta quants registres complets (COUNT(*)) hi ha a la taula 'productes'.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return 0;
    }

    // ──────────────────────────────────────────────────────────
    //  EJERCICIO 2 / EXERCICI 2 ⭐⭐ — WHERE, ORDER BY, LIMIT
    // ──────────────────────────────────────────────────────────

    /**
     * [CAT] Retorna els noms dels productes de la categoria donada, ordenats per preu descendent.
     * [ES]  Devuelve los nombres de los productos de la categoría dada, ordenados por precio descendente.
     */
    public static List<String> ex2_productosPorCategoria(Connection conn, String categoria)
            throws SQLException {
        // [ES]  TODO — Obtén el 'nom' de 'productes' filtrando por 'categoria' = ? y ordenando por 'preu' descendentemente.
        // [CAT] TODO — Obtén el 'nom' de 'productes' filtrant per 'categoria' = ? i ordenant per 'preu' descendentment.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, categoria);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(rs.getString("nom"));
                }
            }
        }
        return list;
    }

    /**
     * [CAT] Retorna els N productes més cars (top N per preu, ordre descendent).
     * [ES]  Devuelve los N productos más caros (top N por precio, orden descendente).
     */
    public static List<String> ex2_topNProductos(Connection conn, int n) throws SQLException {
        // [ES]  TODO — Obtén el 'nom' de 'productes' ordenado por 'preu' descendentemente y usa LIMIT para coger sólo ? registros.
        // [CAT] TODO — Obtén el 'nom' de 'productes' ordenat per 'preu' descendentment i usa LIMIT per agafar només ? registres.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, n);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(rs.getString("nom"));
                }
            }
        }
        return list;
    }

    /**
     * [CAT] Retorna els clients del segment donat que siguin del país donat. Llista de noms, ordenats alfabèticament.
     * [ES]  Devuelve los clientes del segmento dado que sean del país dado. Lista de nombres, ordenados alfabéticamente.
     */
    public static List<String> ex2_clientesPorSegmentoYPais(Connection conn, String segmento, String pais)
            throws SQLException {
        // [ES]  TODO — Obtén 'nom' de 'clients' donde 'segment' = ? y 'pais' = ?, ordenado por 'nom'. 
        // [CAT] TODO — Obtén 'nom' de 'clients' on 'segment' = ? i 'pais' = ?, ordenat per 'nom'.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, segmento);
            stmt.setString(2, pais);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(rs.getString("nom"));
                }
            }
        }
        return list;
    }

    // ──────────────────────────────────────────────────────────
    //  EJERCICIO 3 / EXERCICI 3 ⭐⭐⭐ — JOINs
    // ──────────────────────────────────────────────────────────

    /**
     * [CAT] Retorna Map<nomClient, nombreComandes> per a TOTS els clients (inclou clients sense cap comanda, amb valor 0).
     * [ES]  Devuelve Map<nomClient, numeroPedidos> para TODOS los clientes (incluye clientes sin ningún pedido, con valor 0).
     */
    public static Map<String, Integer> ex3_pedidosPorCliente(Connection conn) throws SQLException {
        // [ES]  TODO — Usa LEFT JOIN entre 'clients' y 'comandes' (en c.id = o.client_id). Agrupa por cliente y cuenta los pedidos. ¡OJO! Selecciona 'c.nom' y el COUNT().
        // [CAT] TODO — Usa LEFT JOIN entre 'clients' i 'comandes'. Agrupa per client i compta les comandes. ULL! Selecciona 'c.nom' i el COUNT().
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        Map<String, Integer> map = new LinkedHashMap<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                map.put(rs.getString(1), rs.getInt(2));
            }
        }
        return map;
    }

    /**
     * [CAT] Retorna el total facturat de les comandes LLIURADES d'un client donat. Retorna 0.0 si no té cap comanda lliurada.
     * [ES]  Devuelve el total facturado de los pedidos ENTREGADOS (LLIURAT) de un cliente dado. Devuelve 0.0 si no tiene ningún pedido entregado.
     */
    public static double ex3_totalFacturadoCliente(Connection conn, String nombreCliente)
            throws SQLException {
        // [ES]  TODO — Junta clients (c), comandes (o) y linies_comanda (lc). Filtra c.nom = ? y o.estat = 'LLIURAT'. Selecciona el SUM(lc.quantitat * lc.preu_unitari).
        // [CAT] TODO — Junta clients, comandes i linies_comanda. Filtra c.nom = ? i o.estat = 'LLIURAT'. Selecciona el SUM(lc.quantitat * lc.preu_unitari).
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreCliente);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble(1);
                }
            }
        }
        return 0.0;
    }

    // ──────────────────────────────────────────────────────────
    //  EJERCICIO 4 / EXERCICI 4 ⭐⭐⭐⭐ — GROUP BY, HAVING
    // ──────────────────────────────────────────────────────────

    /**
     * [CAT] Retorna Map<categoria, preumitja> per a totes les categories. El preu mitjà ha de tenir 2 decimals de precisió.
     * [ES]  Devuelve Map<categoria, precioMedio> para todas las categorías. El precio medio debe tener 2 decimales de precisión.
     */
    public static Map<String, Double> ex4_precioMedioPorCategoria(Connection conn)
            throws SQLException {
        // [ES]  TODO — Haz un GROUP BY de 'categoria' de 'productes'. Selecciona la 'categoria' y el ROUND(AVG(preu), 2).
        // [CAT] TODO — Fes un GROUP BY de 'categoria' de 'productes'. Selecciona la 'categoria' i el ROUND(AVG(preu), 2).
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        Map<String, Double> map = new LinkedHashMap<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                map.put(rs.getString(1), rs.getDouble(2));
            }
        }
        return map;
    }

    /**
     * [CAT] Retorna les categories que tinguin més de {@code minim} productes.
     * [ES]  Devuelve las categorías que tengan más de {@code minim} productos.
     */
    public static List<String> ex4_categoriasConMasDeNProductos(Connection conn, int minim)
            throws SQLException {
        // [ES]  TODO — Selecciona 'categoria', agrupa por ella, pero usa HAVING para dejar solo las que COUNT(*) > ?.
        // [CAT] TODO — Selecciona 'categoria', agrupa per ella, però usa HAVING per deixar només les que COUNT(*) > ?.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, minim);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(rs.getString(1));
                }
            }
        }
        return list;
    }

    // ──────────────────────────────────────────────────────────
    //  EJERCICIO 5 / EXERCICI 5 ⭐⭐⭐⭐⭐ — Subconsultas y SELF JOIN
    // ──────────────────────────────────────────────────────────

    /**
     * [CAT] Retorna els noms dels productes que MAI han estat en cap comanda.
     * [ES]  Devuelve los nombres de los productos que NUNCA han estado en ningún pedido.
     */
    public static List<String> ex5_productosNoDemandados(Connection conn) throws SQLException {
        // [ES]  TODO — Selecciona 'nom' de 'productes' WHERE id NOT IN (...) subconsulta que traiga producte_id de linies_comanda.
        // [CAT] TODO — Selecciona 'nom' de 'productes' WHERE id NOT IN (...) subconsulta que porti producte_id de linies_comanda.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        List<String> list = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                list.add(rs.getString("nom"));
            }
        }
        return list;
    }

    /**
     * [CAT] Retorna Map<nomEmpleat, nomCap> per a cada empleat. Els empleats sense cap (CEO) han de tenir valor "Sense cap".
     * [ES]  Devuelve Map<nomEmpleado, nomJefe> para cada empleado. Los empleados sin jefe (CEO) deben tener valor "Sense cap".
     */
    public static Map<String, String> ex5_empleadoConJefe(Connection conn) throws SQLException {
        // [ES]  TODO — Haz un SELF JOIN de 'empleats' e (empleado) y c (jefe) sobre e.cap_id = c.id. Usa COALESCE(c.nom, 'Sense cap'). Retorna e.nom y el COALESCE.
        // [CAT] TODO — Fes un SELF JOIN de 'empleats' e (empleat) i c (cap) sobre e.cap_id = c.id. Usa COALESCE(c.nom, 'Sense cap'). Retorna e.nom i el COALESCE.
        String sql = "TODO";

        // --- NO MODIFICAR A PARTIR DE AQUÍ / A PARTIR D'AQUÍ ---
        Map<String, String> map = new LinkedHashMap<>();
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                map.put(rs.getString(1), rs.getString(2));
            }
        }
        return map;
    }
}
