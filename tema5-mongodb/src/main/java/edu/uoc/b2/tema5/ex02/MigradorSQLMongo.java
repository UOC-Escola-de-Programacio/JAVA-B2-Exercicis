package edu.uoc.b2.tema5.ex02;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * EXERCICI 02 MongoDB / EJERCICIO 02 MongoDB — Migración / Migració SQL a
 * MongoDB ⭐⭐⭐
 * ============================================================
 *
 * [CAT] OBJECTIU: Implementa el migrador llegint dades agrupades de MySQL via
 * JDBC (DataSource)
 * per inserir-les estructurades a MongoDB.
 * [ES] OBJETIVO: Implementa el migrador leyendo datos agrupados de MySQL vía
 * JDBC (DataSource)
 * para insertarlos estructurados en MongoDB.
 *
 * ESTRUCTURA DESEADA MONGODB / ESTRUCTURA DESITJADA MONGODB:
 * {
 * "cliente_sql_id": 1,
 * "nombre": "Ana García", "email": "ana@test.com", "pais": "ES",
 * "pedidos": [
 * { "pedido_sql_id": 1, "estado": "LLIURAT",
 * "lineas": [
 * {"producto_sql_id": 1, "nombre_prod": "Laptop Pro", "cantidad": 1,
 * "precio_unitario": 1299.99}
 * ]
 * }
 * ]
 * }
 */
public class MigradorSQLMongo {

    private final DataSource mysqlDS;
    private final MongoDatabase mongoDB;

    public MigradorSQLMongo(DataSource mysql, MongoDatabase mongo) {
        this.mysqlDS = mysql;
        this.mongoDB = mongo;
    }

    public void migrar() throws SQLException {
        MongoCollection<Document> clientesMongo = mongoDB.getCollection("clientes_migrados");
        clientesMongo.drop(); // Limpia antes de migrar / Neteja abans de migrar

        Map<Integer, Document> clientesDocs = new HashMap<>();

        try (Connection conn = mysqlDS.getConnection()) {

            // 1. CARREGAR CLIENTS / CARGAR CLIENTES:
            // [ES] TODO — SELECT id, nom, email, pais FROM clients
            // Crea un Document por cada cliente con ArrayLists vacíos para "pedidos".
            // Guárdalos en el mapa `clientesDocs` por ID.
            // [CAT] TODO — SELECT id, nom, email, pais FROM clients
            // Crea un Document per a cada client amb ArrayLists buits per a "pedidos".
            // Desa'ls en el mapa `clientesDocs` per ID.
            throw new UnsupportedOperationException("TODO: Paso 1");

            // 2. CARREGAR COMANDES I LÍNIES / CARGAR PEDIDOS Y LÍNEAS:
            // [ES] TODO — SELECT o.id as comanda_id, o.client_id, o.estat, o.creat_el,
            // lc.producte_id, p.nom AS prod_nom, lc.quantitat, lc.preu_unitari
            // FROM comandes o JOIN linies_comanda lc ON ... JOIN productes p ON ...
            // Por cada línea del ResultSet:
            // - Localiza el Document del cliente adecuado en `clientesDocs`.
            // - Anida los documentos "pedidos" y sus relativas "lineas" según corresponda
            // la estructura.
            // [CAT] TODO — SELECT o.id as comanda_id, o.client_id, o.estat, o.creat_el,
            // lc.producte_id, p.nom AS prod_nom, lc.quantitat, lc.preu_unitari
            // FROM comandes o JOIN linies_comanda lc ON ... JOIN productes p ON ...
            // Per a cada línia del ResultSet:
            // - Localitza el Document del client adequat a `clientesDocs`.
            // - Nia els documents "pedidos" i les seves relatives "lineas" segons
            // correspongui l'estructura.
            throw new UnsupportedOperationException("TODO: Paso 2");
        }

        // 3. INSERIR A MONGODB / INSERTAR EN MONGODB
        // [ES] TODO — clientesMongo.insertMany(...)
        // [CAT] TODO — clientesMongo.insertMany(...)
        throw new UnsupportedOperationException("TODO: Paso 3");
    }
}
