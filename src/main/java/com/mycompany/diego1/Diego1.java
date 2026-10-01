/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diego1;

/**
 *
 * @author Oiged_02
 */
public class Diego1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }// 1. Declaración del paquete (opcional)
package com.empresa.proyecto;

// 2. Importaciones
import java.util.Scanner;

// 3. Declaración de la clase (debe coincidir con el nombre del archivo)
public class MiPrimerPrograma {

    // 4. Método main - punto de entrada del programa
    public static void main(String[] args) {
        // 5. Código ejecutable
        System.out.println("¡Hola Mundo!");
}// Enteros
byte edad = 25;              // 8 bits: -128 a 127
short año = 2024;            // 16 bits: -32,768 a 32,767
int poblacion = 1000000;     // 32 bits: -2^31 a 2^31-1
long distancia = 15000000000L; // 64 bits

// Decimales
float precio = 19.99f;       // 32 bits
double pi = 3.141592653589793; // 64 bits

// Otros
char inicial = 'A';          // 16 bits Unicode
boolean activo = true;       // true o false
// Variable (puede cambiar)
int contador = 0;
contador = 10; // OK

// Constante (no puede cambiar)
final double PI = 3.14159;
// PI = 3.14; // ERROR de compilación
// Aritméticos: +, -, *, /, %
int suma = 5 + 3;        // 8
int modulo = 10 % 3;     // 1 (residuo)

// Comparación: ==, !=, <, >, <=, >=
boolean esIgual = (5 == 5);   // true

// Lógicos: &&, ||, !
boolean resultado = (5 > 3) && (2 < 4); // true

// Asignación: =, +=, -=, *=, /=
int x = 10;
x += 5; // x = x + 5; ahora x = 15
public class EstructuraBasica {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre = "María";
        int edad = 28;
        double salario = 45000.50;
        boolean esEmpleado = true;

        // Operaciones
        double salarioAnual = salario * 12;
        int edadProxima = edad + 1;

        // Salida de datos
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad actual: " + edad);
        System.out.println("Edad próximo año: " + edadProxima);
        System.out.println("Salario mensual: $" + salario);
        System.out.println("Salario anual: $" + salarioAnual);
        System.out.println("¿Es empleado activo? " + esEmpleado);
    }
}=== INFORMACIÓN DEL EMPLEADO ===
Nombre: María
Edad actual: 28
Edad próximo año: 29
Salario mensual: $45000.5
Salario anual: $546006.0
¿Es empleado activo? true

if (condición) {
    // Código si la condición es verdadera
} else if (otraCondición) {
    // Código si la primera es falsa pero esta es verdadera
} else {
    // Código si todas las condiciones son falsas
}public class SistemaCalificaciones {
    public static void main(String[] args) {
        int nota = 85;
        String calificacion;

        if (nota >= 90) {
            calificacion = "A - Excelente";
        } else if (nota >= 80) {
            calificacion = "B - Muy Bueno";
        } else if (nota >= 70) {
            calificacion = "C - Bueno";
        } else if (nota >= 60) {
            calificacion = "D - Suficiente";
        } else {
            calificacion = "F - Reprobado";
        }

        System.out.println("Nota: " + nota);
        System.out.println("Calificación: " + calificacion);
    }
}Nota: 85
Calificación: B - Muy Bueno
        public class SistemaDescuentos {
    public static void main(String[] args) {
        double totalCompra = 1500.00;
        String tipoCliente = "VIP"; // "Regular", "Premium", "VIP"
        double descuento = 0;

        // Descuento por monto
        if (totalCompra >= 2000) {
            descuento = 0.20; // 20%
        } else if (totalCompra >= 1000) {
            descuento = 0.15; // 15%
        } else if (totalCompra >= 500) {
            descuento = 0.10; // 10%
        }

        // Descuento adicional por tipo de cliente
        if (tipoCliente.equals("VIP")) {
            descuento += 0.05; // 5% adicional
        } else if (tipoCliente.equals("Premium")) {
            descuento += 0.03; // 3% adicional
        }

        double montoDescuento = totalCompra * descuento;
        double totalFinal = totalCompra - montoDescuento;

        System.out.println("=== DETALLE DE COMPRA ===");
        System.out.println("Subtotal: $" + totalCompra);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
    }
}=== DETALLE DE COMPRA ===
Subtotal: $1500.0
Tipo de cliente: VIP
Descuento aplicado: 20.0%
Monto descontado: $300.0
TOTAL A PAGAR: $1200.0
public class OperadorTernario {
    public static void main(String[] args) {
        int edad = 17;

        // Forma tradicional
        String mensaje1;
        if (edad >= 18) {
            mensaje1 = "Mayor de edad";
        } else {
            mensaje1 = "Menor de edad";
        }

        // Forma compacta con operador ternario
        String mensaje2 = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(mensaje2);

        // Útil para asignaciones rápidas
        int precio = 100;
        double precioFinal = (precio > 50) ? precio * 0.9 : precio;
        System.out.println("Precio final: $" + precioFinal);
    }
}Menor de edad
Precio final: $90.0

switch (expresión) {
    case valor1:
        // Código
        break;
    case valor2:
        // Código
        break;
    default:
        // Código si ningún caso coincide
}public class MenuRestaurante {
    public static void main(String[] args) {
        int opcion = 3;
        String plato;
        double precio;

        switch (opcion) {
            case 1:
                plato = "Hamburguesa Clásica";
                precio = 8.99;
                break;
            case 2:
                plato = "Pizza Margherita";
                precio = 12.50;
                break;
            case 3:
                plato = "Ensalada César";
                precio = 7.99;
                break;
            case 4:
                plato = "Pasta Carbonara";
                precio = 11.00;
                break;
            case 5:
                plato = "Sushi Roll (8 piezas)";
                precio = 15.99;
                break;
            default:
                plato = "Opción no válida";
                precio = 0.0;
        }

        System.out.println("=== PEDIDO ===");
        System.out.println("Plato seleccionado: " + plato);
        System.out.println("Precio: $" + precio);
    }
}=== PEDIDO ===
Plato seleccionado: Ensalada César
Precio: $7.99
public class DiasLaborales {
    public static void main(String[] args) {
        String dia = "Lunes";
        String tipoJornada;
        int horasTrabajo;

        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                tipoJornada = "Día laboral";
                horasTrabajo = 8;
                break;
            case "Sábado":
                tipoJornada = "Medio día";
                horasTrabajo = 4;
                break;
            case "Domingo":
                tipoJornada = "Descanso";
                horasTrabajo = 0;
                break;
            default:
                tipoJornada = "Día no válido";
                horasTrabajo = 0;
        }

        System.out.println("Día: " + dia);
        System.out.println("Tipo: " + tipoJornada);
        System.out.println("Horas de trabajo: " + horasTrabajo);
    }
}Día: Lunes
Tipo: Día laboral
Horas de trabajo: 8

public class SwitchModerno {
    public static void main(String[] args) {
        String mes = "Enero";

        // Switch expression (más conciso)
        int diasDelMes = switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio",
                 "Agosto", "Octubre", "Diciembre" -> 31;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            case "Febrero" -> 28;
            default -> 0;
        };

        System.out.println(mes + " tiene " + diasDelMes + " días");

        // Con bloques de código
        String trimestre = switch (mes) {
            case "Enero", "Febrero", "Marzo" -> {
                System.out.println("Primer trimestre del año");
                yield "Q1";
            }
            case "Abril", "Mayo", "Junio" -> {
                System.out.println("Segundo trimestre del año");
                yield "Q2";
            }
            case "Julio", "Agosto", "Septiembre" -> "Q3";
            case "Octubre", "Noviembre", "Diciembre" -> "Q4";
            default -> "Mes inválido";
        };

        System.out.println("Trimestre: " + trimestre);
    }
}Enero tiene 31 días
Primer trimestre del año
Trimestre: Q1
  for (inicialización; condición; actualización) {
    // Código a repetir
}public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 7;

        System.out.println("=== Tabla del " + numero + " ===");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}=== Tabla del 7 ===
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
...
7 x 10 = 70

public class NominaMensual {
    public static void main(String[] args) {
        double salarioPorHora = 15.50;
        int[] horasTrabajadas = {8, 8, 7, 9, 8, 6, 0}; // Lun-Dom
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        double totalSemanal = 0;

        System.out.println("=== REPORTE SEMANAL ===");
        System.out.println("Salario por hora: $" + salarioPorHora);
        System.out.println("\nDetalle diario:");

        for (int i = 0; i < horasTrabajadas.length; i++) {
            double pagoDiario = horasTrabajadas[i] * salarioPorHora;
            totalSemanal += pagoDiario;

            System.out.println(dias[i] + ": " + horasTrabajadas[i] +
                    " horas = $" + pagoDiario);
        }

        System.out.println("\nTOTAL SEMANAL: $" + totalSemanal);
        System.out.println("TOTAL MENSUAL (aprox): $" + (totalSemanal * 4));
    }
}=== REPORTE SEMANAL ===
Salario por hora: $15.5

Detalle diario:
Lun: 8 horas = $124.0
Mar: 8 horas = $124.0
...
Dom: 0 horas = $0.0

TOTAL SEMANAL: $713.0
TOTAL MENSUAL (aprox): $2852.0

public class MatrizAsientos {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 8;

        System.out.println("=== MAPA DE ASIENTOS DEL TEATRO ===");
        System.out.println("   A B C D E F G H");
        System.out.println("  =================");

        for (int i = 1; i <= filas; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= columnas; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }

        int totalAsientos = filas * columnas;
        System.out.println("\nTotal de asientos: " + totalAsientos);
    }
}=== MAPA DE ASIENTOS DEL TEATRO ===
   A B C D E F G H
  =================
1 | [ ][ ][ ][ ][ ][ ][ ][ ]
2 | [ ][ ][ ][ ][ ][ ][ ][ ]
3 | [ ][ ][ ][ ][ ][ ][ ][ ]
4 | [ ][ ][ ][ ][ ][ ][ ][ ]
5 | [ ][ ][ ][ ][ ][ ][ ][ ]

Total de asientos: 40
public class IncrementosPersonalizados {
    public static void main(String[] args) {
        // Contar de 2 en 2
        System.out.println("Números pares del 0 al 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Contar hacia atrás
        System.out.println("Cuenta regresiva:");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            if (i == 0) {
                System.out.println("¡DESPEGUE!");
            }
        }
    }
}Números pares del 0 al 20:
0 2 4 6 8 10 12 14 16 18 20 

Cuenta regresiva:
10 9 8 7 6 5 4 3 2 1 0 ¡DESPEGUE!

for (TipoDato variable : colección) {
    // Código a ejecutar con cada elemento
}public class InventarioProductos {
    public static void main(String[] args) {
        String[] productos = {
            "Laptop Dell",
            "Mouse Logitech",
            "Teclado Mecánico",
            "Monitor Samsung",
            "Webcam HD"
        };

        double[] precios = {899.99, 29.99, 89.99, 299.99, 79.99};

        System.out.println("=== CATÁLOGO DE PRODUCTOS ===\n");

        int contador = 0;
        double totalInventario = 0;

        for (String producto : productos) {
            double precio = precios[contador];
            totalInventario += precio;
            System.out.println((contador + 1) + ". " + producto +
                    " - $" + precio);
            contador++;
        }

        System.out.println("\nValor total del inventario: $" + totalInventario);
        System.out.println("Cantidad de productos: " + productos.length);
    }
}=== CATÁLOGO DE PRODUCTOS ===

1. Laptop Dell - $899.99
2. Mouse Logitech - $29.99
3. Teclado Mecánico - $89.99
4. Monitor Samsung - $299.99
5. Webcam HD - $79.99

Valor total del inventario: $1399.95
Cantidad de productos: 5
public class AnalisisVentas {
    public static void main(String[] args) {
        double[] ventasMensuales = {
            15000, 18000, 12000, 22000, 19000,
            21000, 25000, 23000, 20000, 24000,
            28000, 30000
        };

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double totalAnual = 0;
        double ventaMaxima = 0;
        double ventaMinima = ventasMensuales[0];
        String mejorMes = "";
        String peorMes = "";

        int index = 0;
        for (double venta : ventasMensuales) {
            totalAnual += venta;

            if (venta > ventaMaxima) {
                ventaMaxima = venta;
                mejorMes = meses[index];
            }

            if (venta < ventaMinima) {
                ventaMinima = venta;
                peorMes = meses[index];
            }

            index++;
        }

        double promedioMensual = totalAnual / ventasMensuales.length;

        System.out.println("=== REPORTE ANUAL DE VENTAS ===");
        System.out.println("Total anual: $" + totalAnual);
        System.out.println("Promedio mensual: $" + promedioMensual);
        System.out.println("\nMejor mes: " + mejorMes + " ($" + ventaMaxima + ")");
        System.out.println("Peor mes: " + peorMes + " ($" + ventaMinima + ")");
    }


public class AnalisisVentas {
    public static void main(String[] args) {
        double[] ventasMensuales = {
            15000, 18000, 12000, 22000, 19000,
            21000, 25000, 23000, 20000, 24000,
            28000, 30000
        };

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double totalAnual = 0;
        double ventaMaxima = 0;
        double ventaMinima = ventasMensuales[0];
        String mejorMes = "";
        String peorMes = "";

        int index = 0;
        for (double venta : ventasMensuales) {
            totalAnual += venta;

            if (venta > ventaMaxima) {
                ventaMaxima = venta;
                mejorMes = meses[index];
            }

            if (venta < ventaMinima) {
                ventaMinima = venta;
                peorMes = meses[index];
            }

            index++;
        }

        double promedioMensual = totalAnual / ventasMensuales.length;

        System.out.println("=== REPORTE ANUAL DE VENTAS ===");
        System.out.println("Total anual: $" + totalAnual);
        System.out.println("Promedio mensual: $" + promedioMensual);
        System.out.println("\nMejor mes: " + mejorMes + " ($" + ventaMaxima + ")");
        System.out.println("Peor mes: " + peorMes + " ($" + ventaMinima + ")");
    }
}
public class ProcesamientoEmpleados {
    public static void main(String[] args) {
        String[] empleados = {
            "Ana García",
            "Carlos Ruiz",
            "María López",
            "Juan Pérez",
            "Laura Martínez"
        };

        System.out.println("=== LISTA DE EMPLEADOS ACTIVOS ===\n");

        int numeroEmpleado = 1;
        for (String empleado : empleados) {
            String[] nombreCompleto = empleado.split(" ");
            String iniciales = nombreCompleto[0].charAt(0) +
                               "" + nombreCompleto[1].charAt(0);

            System.out.println("ID: EMP-" + String.format("%03d", numeroEmpleado));
            System.out.println("Nombre: " + empleado);
            System.out.println("Iniciales: " + iniciales);
            System.out.println("---");
            // Bucle while: evalúa la condición antes de ejecutar el bloque
while (condición) {
    // Código a repetir
    // Debe haber algo que eventualmente haga la condición falsa
}

// Bucle do-while: ejecuta el código al menos una vez antes de verificar la condición
do {
    // Código a repetir (se ejecuta al menos una vez)
} while (condición);

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";
        int intentosMaximos = 3;
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < intentosMaximos && !accesoConcedido) {
            System.out.println("\n=== SISTEMA DE LOGIN ===");
            System.out.println("Intento " + (intentos + 1) + " de " + intentosMaximos);

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) &&
                password.equals(passwordCorrecto)) {
                accesoConcedido = true;
                System.out.println("\n✓ Acceso concedido. ¡Bienvenido!");
            } else {
                intentos++;
                if (intentos < intentosMaximos) {
                    System.out.println("X Credenciales incorrectas. " +
                                       "Intente nuevamente.");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("\nX Cuenta bloqueada por exceso de intentos.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00;
        int opcion = 0;

        System.out.println("=== BIENVENIDO AL CAJERO AUTOMÁTICO ===");

        while (opcion != 4) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso.");
                        System.out.println("Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                        System.out.println("Nuevo saldo: $" + saldo);
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por usar nuestro cajero.");
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        // Do-While garantiza que se solicite al menos una vez
        do {
            System.out.print("Ingrese su edad (1-120): ");
            edad = scanner.nextInt();

            if (edad < 1 || edad > 120) {
                System.out.println("Edad inválida. Intente nuevamente.");
            }
        } while (edad < 1 || edad > 120);

        System.out.println("\nEdad registrada: " + edad + " años");

        // Clasificación
        if (edad < 18) {
            System.out.println("Categoría: Menor de edad");
        } else if (edad < 65) {
            System.out.println("Categoría: Adulto");
        } else {
            System.out.println("Categoría: Adulto mayor");
        }

        scanner.close();
    }
}
modificadorAcceso tipoRetorno nombreMetodo(parámetros) {
    // Código del método
    return valor; // Si tipoRetorno no es void
}
public class CalculadoraEmpresarial {

    // Método para calcular salario neto
    public static double calcularSalarioNeto(double salarioBruto,
                                             double porcentajeImpuesto) {
        double impuesto = salarioBruto * (porcentajeImpuesto / 100);
        double salarioNeto = salarioBruto - impuesto;
        return salarioNeto;
    }

    // Método para calcular bono anual
    public static double calcularBonoAnual(double salarioMensual,
                                           int mesesTrabajados) {
        if (mesesTrabajados >= 12) {
            return salarioMensual * 2; // 2 meses de bono
        } else if (mesesTrabajados >= 6) {
            return salarioMensual; // 1 mes de bono
        } else {
            return 0;
        }
    }

    // Método para mostrar desglose de nómina
    public static void mostrarDesglose(String nombre, double salarioBruto,
                                       double impuesto, double salarioNeto,
                                       double bono) {
        System.out.println("\n=== DESGLOSE DE NÓMINA ===");
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Impuestos: -$" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);
        System.out.println("Bono anual: $" + bono);
        System.out.println("TOTAL ANUAL: $" + (salarioNeto * 12 + bono));
    }

    // Método principal
    public static void main(String[] args) {
        String empleado = "Carlos Mendoza";
        double salarioBruto = 3500.00;
        double porcentajeImpuesto = 15.0;
        int mesesTrabajados = 12;

        // Llamada a métodos
        double salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeImpuesto);
        double bono = calcularBonoAnual(salarioBruto, mesesTrabajados);
        double impuesto = salarioBruto - salarioNeto;

        mostrarDesglose(empleado, salarioBruto, impuesto, salarioNeto, bono);
    }
}
public class GestionProductos {

    // Método para calcular precio con IVA
    public static double calcularPrecioConIVA(double precioBase,
                                             double porcentajeIVA) {
        return precioBase * (1 + porcentajeIVA / 100);
    }

    // Método para aplicar descuento
    public static double aplicarDescuento(double precio, double descuento) {
        return precio * (1 - descuento / 100);
    }

    // Método para verificar disponibilidad
    public static boolean verificarDisponibilidad(int stock, int cantidad) {
        return stock >= cantidad;
    }

    // Método para calcular total de venta
    public static double calcularTotalVenta(double precioUnitario,
                                           int cantidad,
                                           double descuento) {
        double subtotal = precioUnitario * cantidad;
        return aplicarDescuento(subtotal, descuento);
    }

    // Método para generar código de producto
    public static String generarCodigoProducto(String categoria, int id) {
        return categoria.substring(0, 3).toUpperCase() +
               String.format("%05d", id);
    }

    public static void main(String[] args) {
        // Datos del producto
        String producto = "Laptop";
        String categoria = "Electrónica";
        int id = 123;
        double precio = 800.00;
        int stock = 15;
        int cantidadVenta = 3;
        double descuento = 10.0; // 10%
        double iva = 16.0; // 16%

        // Procesamiento
        String codigo = generarCodigoProducto(categoria, id);
        double precioConIVA = calcularPrecioConIVA(precio, iva);
        boolean disponible = verificarDisponibilidad(stock, cantidadVenta);

        System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Producto: " + producto);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con IVA: $" + precioConIVA);
        System.out.println("Stock disponible: " + stock);

        if (disponible) {
            double total = calcularTotalVenta(precioConIVA, cantidadVenta, descuento);
            System.out.println("\n=== VENTA ===");
            System.out.println("Cantidad: " + cantidadVenta);
            System.out.println("Descuento: " + descuento + "%");
            System.out.println("TOTAL: $" + total);
        } else {
            System.out.println("\nStock insuficiente para la venta.");
        }
    }
}
try {
    // Código que puede lanzar una excepción
} catch (TipoExcepción e) {
    // Código para manejar la excepción
} finally {
    // Código que se ejecuta siempre (opcional)
}
import java.util.Scanner;

public class DivisionSegura {

    public static double dividir(double dividendo, double divisor) 
            throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();

            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            System.out.println("Operación finalizada");
            scanner.close();
        }
    }
}
import java.util.Scanner;

public class ValidacionDatosEmpresariales {

    // Método para validar edad
    public static void validarEdad(int edad) throws Exception {
        if (edad < 18) {
            throw new Exception("El empleado debe ser mayor de 18 años");
        }
        if (edad > 70) {
            throw new Exception("Edad fuera del rango permitido");
        }
    }

    // Método para validar salario
    public static void validarSalario(double salario) throws Exception {
        if (salario < 0) {
            throw new Exception("El salario no puede ser negativo");
        }
        if (salario < 500) {
            throw new Exception("El salario está por debajo del mínimo legal");
        }
    }

    // Método para validar email
    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Formato de email inválido");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== REGISTRO DE EMPLEADO ===");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            validarEdad(edad);

            System.out.print("Email: ");
            String email = scanner.nextLine();
            validarEmail(email);

            System.out.print("Salario mensual: ");
            double salario = Double.parseDouble(scanner.nextLine());
            validarSalario(salario);

            System.out.println("\n✓ Empleado registrado exitosamente");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Email: " + email);
            System.out.println("Salario: $" + salario);

        } catch (NumberFormatException e) {
            System.out.println("X Error: Debe ingresar un número válido");
        } catch (Exception e) {
            System.out.println("X Error de validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
// Declaración
tipo[] nombreArreglo;

// Inicialización
nombreArreglo = new tipo[tamaño];

// Declaración e inicialización juntas
tipo[] nombreArreglo = new tipo[tamaño];

// Con valores iniciales
tipo[] nombreArreglo = {valor1, valor2, valor3};

}
public class SistemaInventario {
    public static void main(String[] args) {
        // Arreglos paralelos para productos
        String[] productos = {
            "Laptop", "Mouse", "Teclado", "Monitor", "Impresora"
        };

        int[] stock = {10, 50, 30, 15, 8};
        double[] precios = {899.99, 19.99, 49.99, 299.99, 199.99};

        // Calcular valor total del inventario
        double valorTotal = 0;
        int productosDisponibles = 0;

        System.out.println("=== REPORTE DE INVENTARIO ===\n");
        System.out.printf("%-15s %10s %12s %15s%n",
                "Producto", "Stock", "Precio", "Valor Total");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            double valorProducto = stock[i] * precios[i];
            valorTotal += valorProducto;
            productosDisponibles += stock[i];

            System.out.printf("%-15s %10d $%11.2f $%14.2f%n",
                    productos[i], stock[i], precios[i], valorProducto);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Total de productos: %d%n", productosDisponibles);
        System.out.printf("Valor total del inventario: $%.2f%n", valorTotal);
    }
}
public class AnalisisTemperaturas {
    public static void main(String[] args) {
        // Temperaturas de la semana (en Celsius)
        double[] temperaturas = {22.5, 24.0, 21.8, 23.5, 25.2, 26.0, 23.8};
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        // Calcular estadísticas
        double suma = 0;
        double maxima = temperaturas[0];
        double minima = temperaturas[0];
        int diaMaxima = 0;
        int diaMinima = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];

            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
                diaMaxima = i;
            }

            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
                diaMinima = i;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("=== ANÁLISIS SEMANAL DE TEMPERATURAS ===\n");

        // Mostrar temperaturas diarias
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s: %.1f°C", dias[i], temperaturas[i]);

            if (temperaturas[i] > promedio) {
                System.out.print(" ↑ (sobre promedio)");
            } else if (temperaturas[i] < promedio) {
                System.out.print(" ↓ (bajo promedio)");
            }
            System.out.println();
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf("Temperatura promedio: %.1f°C%n", promedio);
        System.out.printf("Temperatura máxima: %.1f°C (%s)%n",
                maxima, dias[diaMaxima]);
        System.out.printf("Temperatura mínima: %.1f°C (%s)%n",
                minima, dias[diaMinima]);
    }
}
public class SistemaCalificaciones {
    public static void main(String[] args) {
        // Matriz: [estudiantes][asignaturas]
        String[] estudiantes = {"Ana", "Carlos", "María", "Juan"};
        String[] asignaturas = {"Matemáticas", "Física", "Química"};

        double[][] calificaciones = {
            {85.5, 90.0, 88.5}, // Ana
            {78.0, 82.5, 80.0}, // Carlos
            {92.0, 95.5, 93.0}, // María
            {88.5, 85.0, 87.5}  // Juan
        };

        System.out.println("=== REPORTE DE CALIFICACIONES ===\n");

        // Encabezado
        System.out.printf("%-10s", "Estudiante");
        for (String asignatura : asignaturas) {
            System.out.printf("%15s", asignatura);
        }
        System.out.printf("%15s%n", "Promedio");
        System.out.println("-------------------------------------------------------------------");

        // Datos de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%-10s", estudiantes[i]);

            double suma = 0;
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.printf("%15.1f", calificaciones[i][j]);
                suma += calificaciones[i][j];
            }

            double promedio = suma / asignaturas.length;
            System.out.printf("%15.1f%n", promedio);
        }

        // Promedios por asignatura
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s", "Promedio");

        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / estudiantes.length;
            System.out.printf("%15.1f", promedio);
        }
        System.out.println();
    }
}
import java.util.Arrays;

public class OperacionesArreglos {

    // Método para copiar arreglo
    public static int[] copiarArreglo(int[] original) {
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        return copia;
    }

    // Método para invertir arreglo
    public static void invertirArreglo(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    // Método para buscar elemento
    public static int buscarElemento(int[] arr, int elemento) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {15, 8, 23, 42, 7, 16, 31};

        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        // Copiar arreglo
        int[] copia = copiarArreglo(numeros);
        System.out.println("Copia del arreglo: " + Arrays.toString(copia));

        // Ordenar arreglo
        Arrays.sort(copia);
        System.out.println("Arreglo ordenado: " + Arrays.toString(copia));

        // Invertir arreglo
        invertirArreglo(copia);
        System.out.println("Arreglo invertido: " + Arrays.toString(copia));

        // Buscar elemento
        int buscar = 23;
        int posicion = buscarElemento(numeros, buscar);

        if (posicion != -1) {
            System.out.println("\nElemento " + buscar +
                    " encontrado en posición " + posicion);
        } else {
            System.out.println("\nElemento " + buscar + " no encontrado");
        }

        // Llenar arreglo con un valor
        int[] nuevo = new int[5];
        Arrays.fill(nuevo, 10);
        System.out.println("\nArreglo llenado: " + Arrays.toString(nuevo));

        // Comparar arreglos
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean iguales = Arrays.equals(arr1, arr2);
        System.out.println("\n¿Los arreglos son iguales? " + iguales);
    }
}
// Comentario de una línea

/* Comentario
   de varias
   líneas */

/**
 * Comentario de documentación JavaDoc
 * @param parametro descripción
 * @return descripción