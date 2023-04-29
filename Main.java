class Main {
  public static void main(String[] args) {

    /*Creación de tres objetos de la clase ObjectPerfumeria*/
    ObjectPerfumeria itemOne = new ObjectPerfumeria("Perfume",245643,100,5000);
    ObjectPerfumeria itemTwo = new ObjectPerfumeria("Locion",245981,25,800);
    ObjectPerfumeria itemThree = new ObjectPerfumeria("Crema",257135,40,2500);

    /*Crea la instacia de la clase Table y se la asigna al objeto tableHash */
    Table tableHash = new Table();

    /*Inserta los elementos en la tabla hash*/
    tableHash.insertTwo(itemOne);
    tableHash.insertTwo(itemTwo);
    tableHash.insertTwo(itemThree);

    System.out.println("---------------------------------------------------");
    System.out.println("              Función de dispersión");
    System.out.println("             [Método de la Multiplicación]");
    System.out.println("---------------------------------------------------");
    /*Muestar los elementos almacenados en la tabla hash mediante el método showTable*/
    tableHash.showTable();
     System.out.println("---------------------------------------------------");
  }
}