import java.util.Scanner;
public  class Deportes {
    private String nombre;
    private String apellido;
    private int edad;
    // get y set
    public String GetNomre(){return nombre;}
    public void SetNombre (String nombre){this.nombre=nombre;}
    public String GetApellido(){return apellido;}
    public void SetApellido (String apellido){this.apellido=apellido;}
    public int GetEdad(){return edad;}
    public void SetEdad (int edad){this.edad=edad;}
    // Constructor
    public Deportes (String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    public  void verificar_edad(int edad){
        if (edad >= 18 && edad <100) {
            System.out.println("El participante es mayor de edad");
        } else if(edad<18 && edad>0){
            System.out.println("El participante es menor de edad");
        }else{
            System.out.println("La edad ingresada es inválida.");
        }
    }
    public static class Futbol extends Deportes {
        private String examenes;

        public String GetExamenes(){return examenes;}
        public void SetExamenes (String examenes){this.examenes=examenes;}

        public Futbol(String nombre, String apellido, int edad, String examenes){
            super(nombre,apellido,edad);
            this.examenes=examenes;

        }
        public void mostrar_examenes(String examenes){
            if (examenes.equals("si") ) {
                System.out.println("El participante SI se ha realizado los exámenes médicos.");
            } else if(examenes.equals("no")) {
                System.out.println("El participante NO se ha realizado los exámenes médicos.");
            }
        }

        public void mostrarFutbol(String nombre,String apellido,int edad,String examenes){
            System.out.println("DATOS DEL PRIMER USUARIO");
            System.out.println("Nombre: "+nombre);
            System.out.println("Apellido: "+apellido);
            System.out.println("Edad: "+edad);
            System.out.println("Examenes: "+examenes);

        }

    }
    public static class Atletismo extends Deportes {
        private String aptitudes;
        public String GetAptitudes(){return aptitudes;}
        public void SetAptitudes (String aptitudes){this.aptitudes=aptitudes;}

        public Atletismo(String nombre, String apellido, int edad, String aptitudes){
            super(nombre,apellido,edad);
            this.aptitudes=aptitudes;
        }
        public void mostrar_aptitudes(String aptitudes){
            if (aptitudes.equals("si") ) {
                System.out.println("El participante SI tiene las aptitudes necesarias.");
            } else if(aptitudes.equals("no")) {
                System.out.println("El participante NO se ha realizado los exámenes médicos.");
            }
        }
        public static void mostrarAtletismo(String nombre,String apellido,int edad,String aptitudes){
            System.out.println("DATOS DEL PRIMER USUARIO");
            System.out.println("Nombre: "+nombre);
            System.out.println("Apellido: "+apellido);
            System.out.println("Edad: "+edad);
            System.out.println("Aptitudes: "+aptitudes);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tDEPORTES EPN");
        try{
            System.out.println("Por favor ingrese el nombre del primer participante: ");
            String nombre = sc.nextLine();
            System.out.println("Por favor ingrese el apellido del primer participante: ");
            String apellido = sc.nextLine();
            System.out.println("Por favor ingrese la edad del primer participante: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Escriba (si/no)");
            System.out.println("El primer participante se ha realizado algun chequeo médico?: ");
            String examenes = sc.nextLine();
            Deportes.Futbol estudiante1= new Deportes.Futbol(nombre,apellido,edad,examenes);
            estudiante1.verificar_edad(edad);
            estudiante1.mostrar_examenes(examenes);
            estudiante1.mostrarFutbol(nombre,apellido,edad,examenes);
        }catch(Exception e){
            System.out.println("Error al ingresar algún dato !!!");
            sc.nextLine();
        }
        try{
            System.out.println("Por favor ingrese el nombre del segundo participante: ");
            String nombre = sc.nextLine();
            System.out.println("Por favor ingrese el apellido del segundo participante: ");
            String apellido = sc.nextLine();
            System.out.println("Por favor ingrese la edad del segundo participante: ");
            int edad = sc.nextInt();
            System.out.println("Escriba (si/no)");
            sc.nextLine();
            System.out.println("El segundo participante tiene las aptitudes necesarias?: ");
            String aptitudes = sc.nextLine();
            Deportes.Atletismo estudiante2= new Deportes.Atletismo(nombre,apellido,edad,aptitudes);
            estudiante2.verificar_edad(edad);
            estudiante2.mostrar_aptitudes(aptitudes);
            estudiante2.mostrarAtletismo(nombre,apellido,edad,aptitudes);
        }catch(Exception e){
            System.out.println("Error al ingresar algún dato!!!");
            sc.nextLine();
        }

    }
}