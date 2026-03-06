package edu.uoc.b2.tema4.ex02;

import java.sql.*;
import java.util.*;

/**
 * ============================================================
 * EXERCICIO 02 JDBC / EXERCICI 02 JDBC — Consultas / Consultes ⭐⭐⭐
 * ============================================================
 *
 * [CAT] INSTRUCCIONS:
 * - Implementa tant les consultes SQL com el codi JDBC complet.
 * - USA PreparedStatement per a qualsevol consulta amb paràmetres.
 * - Llegeix els resultats dels ResultSet i emplena les dades corresponents.
 *
 * [ES] INSTRUCCIONES:
 * - Implementa tanto las consultas SQL como el código JDBC completo.
 * - USA PreparedStatement para cualquier consulta con parámetros.
 * - Lee los resultados de los ResultSet y llena los datos correspondientes.
 */
public class ConsultasSQL {

    public static List<String> ex1_nombresClientes(Connection conn) throws SQLException {
        // [ES] TODO — Escribe la consulta para obtener los nombres de todos los
        // clientes de A a Z.
        // — Luego, usa PreparedStatement y ResultSet para llenar y devolver una
        // List<String>.
        // [CAT] TODO — Escriu la consulta per obtenir els noms de tots els clients de A
        // a Z.
        // — Després, usa PreparedStatement i ResultSet per omplir i retornar una
        // List<String>.
        throw new UnsupportedOperationException("TODO");
    }

    public static int ex1_totalProductos(Connection conn) throws SQLException {
        // [ES] TODO — Cuenta cuántos registros completos (COUNT(*)) hay en la tabla
        // 'productes'.
        // — Retorna ese número como un int.
        // [CAT] TODO — Compta quants registres complets (COUNT(*)) hi ha a la taula
        // 'productes'.
        // — Retorna aquest nombre com un int.
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> ex2_productosPorCategoria(Connection conn, String categoria) throws SQLException {
        // [ES] TODO — Consulta los nombres de productos filtrados por una categoría
        // específica,
        // ordenados por precio descendentemente.
        // — Pasa el parámetro 'categoria' al PreparedStatement y extrae la lista.
        // [CAT] TODO — Consulta els noms de productes filtrats per una categoria
        // específica,
        // ordenats per preu descendentment.
        // — Passa el paràmetre 'categoria' al PreparedStatement i extreu la llista.
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> ex2_topNProductos(Connection conn, int n) throws SQLException {
        // [ES] TODO — Obtén los nombres de los N productos más caros (usa ORDER BY y
        // LIMIT ?).
        // — Aplica el parámetro N y devuelve el listado.
        // [CAT] TODO — Obtén els noms dels N productes més cars (usa ORDER BY i LIMIT
        // ?).
        // — Aplica el paràmetre N i retorna el llistat.
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> ex2_clientesPorSegmentoYPais(Connection conn, String segmento, String pais)
            throws SQLException {
        // [ES] TODO — Obtén el 'nom' de clientes de un 'segment' y un 'pais'
        // específicos, ordenado por 'nom'.
        // — Utiliza dos parámetros en tu PreparedStatement.
        // [CAT] TODO — Obtén el 'nom' de clients d'un 'segment' i un 'pais' específics,
        // ordenat per 'nom'.
        // — Utilitza dos paràmetres en el teu PreparedStatement.
        throw new UnsupportedOperationException("TODO");
    }

    public static Map<String, Integer> ex3_pedidosPorCliente(Connection conn) throws SQLException {
        // [ES] TODO — Une 'clients' (LEFT JOIN) con 'comandes' sobre client_id. Agrupa
        // por cliente y
        // cuenta cuántos pedidos ('comandes') tiene cada uno (incluso 0).
        // — Guarda todo iterando el ResultSet en un Map<String, Integer> y devuélvelo.
        // [CAT] TODO — Uneix 'clients' (LEFT JOIN) amb 'comandes' sobre client_id.
        // Agrupa per client i
        // compta quantes comandes ('comandes') té cadascun (fins i tot 0).
        // — Desa tot iterant el ResultSet en un Map<String, Integer> i retorna'l.
        throw new UnsupportedOperationException("TODO");
    }

    public static double ex3_totalFacturadoCliente(Connection conn, String nombreCliente) throws SQLException {
        // [ES] TODO — Junta clients, comandes, y linies_comanda.
        // — Filtra por nombre de cliente y donde estado sea = 'LLIURAT'.
        // — Calcula la suma total multiplicando (quantitat * preu_unitari).
        // — Devuelve el resultado leído del ResultSet (0.0 si no hay).
        // [CAT] TODO — Junta clients, comandes, i linies_comanda.
        // — Filtra per nom de client i on l'estat sigui = 'LLIURAT'.
        // — Calcula la suma total multiplicant (quantitat * preu_unitari).
        // — Retorna el resultat llegit del ResultSet (0.0 si no n'hi ha).
        throw new UnsupportedOperationException("TODO");
    }

    public static Map<String, Double> ex4_precioMedioPorCategoria(Connection conn) throws SQLException {
        // [ES] TODO — Haz un GROUP BY de 'categoria' en la tabla 'productes'.
        // — Calcula el precio medio (AVG) redondeado a 2 decimales (ROUND).
        // — Devuélvelo en un Map<Categoria, PrecioMedio>.
        // [CAT] TODO — Fes un GROUP BY de 'categoria' a la taula 'productes'.
        // — Calcula el preu mitjà (AVG) arrodonit a 2 decimals (ROUND).
        // — Retorna-ho en un Map<Categoria, PrecioMedio>.
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> ex4_categoriasConMasDeNProductos(Connection conn, int minim) throws SQLException {
        // [ES] TODO — Selecciona 'categoria' agrupándola y deja solo las que tengan
        // COUNT(*) > ?.
        // — Retorna la lista de esas categorías.
        // [CAT] TODO — Selecciona 'categoria' agrupant-la i deixa només les que tinguin
        // COUNT(*) > ?.
        // — Retorna la llista d'aquestes categories.
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> ex5_productosNoDemandados(Connection conn) throws SQLException {
        // [ES] TODO — Selecciona los nombres de productos cuyo id NO esté (NOT IN)
        // en la tabla de líneas de pedido (linies_comanda).
        // [CAT] TODO — Selecciona els noms de productes l'id dels quals NO estigui (NOT
        // IN)
        // a la taula de línies de comanda (linies_comanda).
        throw new UnsupportedOperationException("TODO");
    }

    public static Map<String, String> ex5_empleadoConJefe(Connection conn) throws SQLException {
        // [ES] TODO — Completa un SELF JOIN para obtener el nombre del empleado y el
        // nombre del jefe.
        // — Si no tiene jefe, devuelve "Sense cap" usando COALESCE.
        // — Devuelve el resultado en un Map<String, String>.
        // [CAT] TODO — Completa un SELF JOIN per obtenir el nom de l'empleat i el nom
        // del cap.
        // — Si no té cap, retorna "Sense cap" usant COALESCE.
        // — Retorna el resultat en un Map<String, String>.
        throw new UnsupportedOperationException("TODO");
    }
}
