package persona;

public class Persona {

    private int id;
    private String name;
    private String phone;
    private String email;
    private static int numberOfPeople = 0;

    public Persona() {
        //Creo el Id por cada vez que la variable de cantidad de personas se crea en la clase
        this.id = ++Persona.numberOfPeople;
    }

    public Persona(String name, String phone,String email) {
        this();//se llama al constructor vacio que contiene la suma del id
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        Persona.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Los datos de la Persona" +
                "\n N°: " + id +
                "\nNombre: '" + name + '\'' +
                "\nTelefono: '" + phone + '\'' +
                "\nEmail: " + email +
                "\nCantidad de Personas en el Listado: " + numberOfPeople;
    }
}
