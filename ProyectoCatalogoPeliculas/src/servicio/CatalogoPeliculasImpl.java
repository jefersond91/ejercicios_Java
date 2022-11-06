package servicio;

import datos.AccesoDatosImpl;
import datos.IAccesoDatos;
import domian.Pelicula;
import excepciones.*;


/**
 *
 * @author Jeferson
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }


    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("error acceso a datos agregarPelicula");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            peliculas.forEach(pelicula -> {
                System.out.println("Pelicula: " + pelicula);
            });
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos listarPelicula");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_ARCHIVO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos buscarPelicula");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado: " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_ARCHIVO)){
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }
            else{
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }
       
}
