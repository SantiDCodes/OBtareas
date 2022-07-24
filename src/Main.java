public class Main {
    public static void main(String[] args)
    {
        Persona persona = new Persona(0,"0","0");
        System.out.println("Tarea numero 3 de Open BootCamp");
        System.out.println("");
        System.out.println("<<<CLASES>>>");
        System.out.println("");
        System.out.println("Persona:");
        System.out.println(">Edad:"+persona.getEdad()+"  >Nombre:"+persona.getNombre()+"  >Telefono:"+persona.getTelefono());
        persona.setEdad(17);/*asigno edad*/
        persona.setNombre("Juan");/*asigno nombre*/
        persona.setTelefono("+5493813451996");/*asigno telefono*/
        System.out.println(">Edad:"+persona.getEdad()+"  >Nombre:"+persona.getNombre()+"  >Telefono:"+persona.getTelefono());








    }
    /*CLASE PERSONA*/
    public static class Persona{

        /*Atributos de la CLASE*/
        private int edad;
        private String nombre;
        private String telefono;
        /*Fin de Atributos*/

        /*Constructor de la clase de la CLASE*/
        public Persona(int edad, String nombre,String telefono)
                {
                    this.edad = edad;
                    this.nombre = nombre;
                    this.telefono = telefono;
                }
        /*Fin de Constructor*/

        /*Metodos de la clase de la SETs y GETs*/

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        /*Fin Metodos de GETs y SETs*/
    }
    /*FIN CLASE PERSONA*/



}