package edu.uoc.b2.tema1.ex01;

/**
 * ============================================================
 * EXERCICIO 01 / EXERCICI 01 — Clase Inmutable: Temperatura  ⭐ (Fácil / Fàcil)
 * ============================================================
 *
 * [CAT] OBJECTIU: Implementa la classe {@code Temperatura} seguint el patró
 * d'immutabilitat. La classe ha de ser immutable: sense setters, tots els
 * camps {@code final}, i cada operació retorna un NOU objecte.
 *
 * [ES]  OBJETIVO: Implementa la clase {@code Temperatura} siguiendo el patrón
 * de inmutabilidad. La clase debe ser inmutable: sin setters, todos los
 * campos {@code final}, y cada operación devuelve un NUEVO objeto.
 *
 * MÉTODOS / MÈTODES:
 *   Constructor: Temperatura(double grados) — valida >= -273.15
 *   getGrados()                : double  — Devuelve/Retorna los grados/graus Celsius
 *   toFahrenheit()             : double  — F = C × 9/5 + 32
 *   toKelvin()                 : double  — K = C + 273.15
 *   sumar(double delta)        : Temperatura — Devuelve/Retorna NUEVA/NOVA instància
 *   restar(double delta)       : Temperatura — Devuelve/Retorna NUEVA/NOVA instància
 *   equals(Object) y hashCode(): basados en grados (tolerancia 0.001) / basats en graus (tolerància 0.001)
 *   toString()                 : "25.00 °C"
 *
 * EJEMPLO / EXEMPLE:
 *   Temperatura t1 = new Temperatura(100.0);
 *   Temperatura t2 = t1.sumar(20.0);
 *   System.out.println(t1); // "100.00 °C" ← t1 NO ha cambiado / NO ha canviat
 *   System.out.println(t2); // "120.00 °C"
 *   System.out.println(t1.toFahrenheit()); // 212.0
 */
public final class Temperatura {

    // [ES]  TODO — Declara el campo 'grados' como private final double. Debe ser final para garantizar inmutabilidad.
    // [CAT] TODO — Declara el camp 'grados' com a private final double. Ha de ser final per garantir la immutabilitat.

    /**
     * [ES]  TODO — Implementa el constructor Temperatura(double grados). Valida que no sea inferior al cero absoluto (-273.15 °C).
     *              Si lo es, lanza: throw new IllegalArgumentException("Temperatura inferior al cero absoluto: " + grados);
     * [CAT] TODO — Implementa el constructor Temperatura(double grados). Valida que no sigui inferior al zero absolut (-273.15 °C).
     *              Si ho és, llança: throw new IllegalArgumentException("Temperatura inferior al zero absolut: " + grados);
     */
    // Tu código aquí / El teu codi aquí

    /**
     * [ES]  Devuelve los grados Celsius de esta temperatura.
     * [CAT] Retorna els graus Celsius d'aquesta temperatura.
     */
    public double getGrados() {
        // [ES]  TODO — Devuelve el campo 'grados'
        // [CAT] TODO — Retorna el camp 'grados'
        throw new UnsupportedOperationException("TODO: implementa getGrados()");
    }

    /**
     * [ES]  Convierte la temperatura a grados Fahrenheit. Fórmula: F = C × 9/5 + 32
     * [CAT] Converteix la temperatura a graus Fahrenheit. Fórmula: F = C × 9/5 + 32
     */
    public double toFahrenheit() {
        // [ES]  TODO — Aplica la fórmula de conversión
        // [CAT] TODO — Aplica la fórmula de conversió
        throw new UnsupportedOperationException("TODO: implementa toFahrenheit()");
    }

    /**
     * [ES]  Convierte la temperatura a Kelvin. Fórmula: K = C + 273.15
     * [CAT] Converteix la temperatura a Kelvin. Fórmula: K = C + 273.15
     */
    public double toKelvin() {
        // [ES]  TODO — Aplica la fórmula de conversión
        // [CAT] TODO — Aplica la fórmula de conversió
        throw new UnsupportedOperationException("TODO: implementa toKelvin()");
    }

    /**
     * [ES]  Devuelve una NUEVA temperatura con {@code delta} grados añadidos. Esta temperatura NO se modifica.
     * [CAT] Retorna una NOVA temperatura amb {@code delta} graus afegits. Aquesta temperatura NO es modifica.
     */
    public Temperatura sumar(double delta) {
        // [ES]  TODO — Crea y devuelve un NUEVO objeto Temperatura con (grados + delta)
        // [CAT] TODO — Crea i retorna un NOU objecte Temperatura amb (grados + delta)
        throw new UnsupportedOperationException("TODO: implementa sumar()");
    }

    /**
     * [ES]  Devuelve una NUEVA temperatura con {@code delta} grados restados. Esta temperatura NO se modifica.
     * [CAT] Retorna una NOVA temperatura amb {@code delta} graus restats. Aquesta temperatura NO es modifica.
     *
     * @throws IllegalArgumentException si el resultado / resultat < -273.15
     */
    public Temperatura restar(double delta) {
        // [ES]  TODO — Crea y devuelve una NUEVA Temperatura con (grados - delta). El constructor ya validará el cero absoluto.
        // [CAT] TODO — Crea i retorna una NOVA Temperatura amb (grados - delta). El constructor ja validarà el zero absolut.
        throw new UnsupportedOperationException("TODO: implementa restar()");
    }

    /**
     * [ES]  Dos temperaturas son iguales si difieren menos de 0.001 °C.
     * [CAT] Dues temperatures són iguals si difereixen menys de 0.001 °C.
     */
    @Override
    public boolean equals(Object other) {
        // [ES]  TODO — Implementa equals comparando grados con tolerancia de 0.001 (Math.abs(this.grados - that.grados) < 0.001)
        // [CAT] TODO — Implementa equals comparant graus amb tolerància de 0.001 (Math.abs(this.grados - that.grados) < 0.001)
        throw new UnsupportedOperationException("TODO: implementa equals()");
    }

    @Override
    public int hashCode() {
        // [ES]  TODO — Implementa hashCode basado en grados (Ej: Double.hashCode(Math.round(grados * 100.0) / 100.0))
        // [CAT] TODO — Implementa hashCode basat en graus (Ex: Double.hashCode(Math.round(grados * 100.0) / 100.0))
        throw new UnsupportedOperationException("TODO: implementa hashCode()");
    }

    /**
     * [ES]  Formato: "25.00 °C"
     * [CAT] Format: "25.00 °C"
     */
    @Override
    public String toString() {
        // [ES]  TODO — Devuelve el String con formato "%.2f °C" (2 decimales) (String.format("%.2f °C", grados))
        // [CAT] TODO — Retorna el String amb format "%.2f °C" (2 decimals) (String.format("%.2f °C", grados))
        throw new UnsupportedOperationException("TODO: implementa toString()");
    }
}
