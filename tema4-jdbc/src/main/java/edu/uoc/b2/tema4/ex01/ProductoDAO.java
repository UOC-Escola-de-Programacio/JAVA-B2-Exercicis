package edu.uoc.b2.tema4.ex01;

import java.sql.*;
import java.util.*;

/**
 * ============================================================
 * EXERCICIO 01 JDBC / EXERCICI 01 JDBC — CRUD DAO bàsic / básico ⭐⭐ (Fácil /
 * Fàcil)
 * ============================================================
 *
 * [CAT] OBJECTIU: Implementa un DAO (Data Access Object) complet per a la
 * entitat Producte.
 * [ES] OBJETIVO: Implementa un DAO (Data Access Object) completo para la
 * entidad Producto.
 *
 * SCHEMA (ja creat pels tests / ya creado por los tests):
 * CREATE TABLE productos (
 * id INT PRIMARY KEY AUTO_INCREMENT,
 * nombre VARCHAR(200) NOT NULL,
 * precio DECIMAL(10,2) NOT NULL,
 * stock INT DEFAULT 0
 * );
 */
public class ProductoDAO {

    private final Connection conn;

    public ProductoDAO(Connection conn) {
        this.conn = conn;
    }

    // Record que representa un Producto
    public record Producto(Integer id, String nombre, double precio, int stock) {
    }

    /**
     * [CAT] Insereix un nou producte i retorna el seu ID generat automàticament.
     * [ES] Inserta un nuevo producto y devuelve su ID generado automáticamente.
     *
     * @param nombre nom del producte / nombre del producto
     * @param precio preu / precio (> 0)
     * @param stock  estoc inicial / stock inicial (>= 0)
     * @return l'ID generat per la base de dades / el ID generado por la base de
     *         datos
     * @throws SQLException si hi ha un error de BD / si hay un error de BD
     */
    public int insertar(String nombre, double precio, int stock) throws SQLException {
        // [ES] TODO — INSERT INTO productos (nombre, precio, stock) VALUES (?, ?, ?)
        // Usa PreparedStatement con Statement.RETURN_GENERATED_KEYS
        // Recupera el ID generado con stmt.getGeneratedKeys()
        // [CAT] TODO — INSERT INTO productos (nombre, precio, stock) VALUES (?, ?, ?)
        // Usa PreparedStatement amb Statement.RETURN_GENERATED_KEYS
        // Recupera l'ID generat amb stmt.getGeneratedKeys()
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * [CAT] Cerca un producte per ID.
     * [ES] Busca un producto por ID.
     *
     * @param id l'ID del producte / el ID del producto
     * @return Optional amb el Producto si existeix, o empty() si no / Optional con
     *         el Producto si existe, o empty() si no
     */
    public Optional<Producto> buscarPorId(int id) throws SQLException {
        // [ES] TODO — SELECT * FROM productos WHERE id = ?
        // Si rs.next() es true, construye y devuelve un Producto con los campos del
        // ResultSet
        // [CAT] TODO — SELECT * FROM productos WHERE id = ?
        // Si rs.next() és true, construeix i retorna un Producto amb els camps del
        // ResultSet
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * [CAT] Retorna tots els productes ordenats per nom.
     * [ES] Devuelve todos los productos ordenados por nombre.
     */
    public List<Producto> listarTodos() throws SQLException {
        // [ES] TODO — SELECT * FROM productos ORDER BY nombre
        // [CAT] TODO — SELECT * FROM productos ORDER BY nombre
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * [CAT] Actualitza el preu d'un producte existent.
     * [ES] Actualiza el precio de un producto existente.
     *
     * @return true si s'ha actualitzat (hi havia fila afectada), false si l'ID no
     *         existia / true si se ha actualizado, false si no
     */
    public boolean actualizarPrecio(int id, double nuevoPrecio) throws SQLException {
        // [ES] TODO — UPDATE productos SET precio = ? WHERE id = ?
        // Usa stmt.executeUpdate() y comprueba si devuelve > 0
        // [CAT] TODO — UPDATE productos SET precio = ? WHERE id = ?
        // Usa stmt.executeUpdate() i comprova si retorna > 0
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * [CAT] Elimina un producte per ID.
     * [ES] Elimina un producto por ID.
     *
     * @return true si s'ha eliminat, false si no existia / true si se ha eliminado,
     *         false si no existía
     */
    public boolean eliminar(int id) throws SQLException {
        // [ES] TODO — DELETE FROM productos WHERE id = ?
        // [CAT] TODO — DELETE FROM productos WHERE id = ?
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * [CAT] Retorna el nombre total de productes a la taula.
     * [ES] Devuelve el número total de productos en la tabla.
     */
    public int contar() throws SQLException {
        // [ES] TODO — SELECT COUNT(*) FROM productos
        // [CAT] TODO — SELECT COUNT(*) FROM productos
        throw new UnsupportedOperationException("TODO");
    }
}
