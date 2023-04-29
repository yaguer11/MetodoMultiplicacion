/* Implementación de tabla hash para almacenar objetos de clase ObjectPerfumeria*/
import java.math.BigInteger;

class Table {
  
  static ObjectPerfumeria[] m;
  static final double R = 0.618034;
  
  public Table() {
    this.m = new ObjectPerfumeria[1024];
  }

  /*Toma un valor x como entrada y utiliza el método de dispersión de la multiplicación para calcular la posición en la que sebe almacenar el objeto. Retorna un entero ya que la table tiene 1024 posiciones */
  public static int multiplicationMethod(long x){
    return (int) Math.floor(m.length * ((R * x) % 1));
  }

  /*Este metodo recibe una cadena de caracteres y devuelve un entero long. La iteración se hace sobre los 10 primeros caracteres de la cadena*/
  static long transformKey(String clave){
    long d;
    d = 0;
    for (int j = 0; j < Math.min(clave.length(),10); j++)
        {
            d = d * 27 + (int) clave.charAt(j);
        }
    if (d < 0) d = -d;
    return d;
  }
  /*Este método toma como entrada un número tipo long y devuelve un entero que es la posición calculada utilizando el método de la multiplicación*/
  static int dispersion(long x)
  {
  double t;
  int v;
  t = R * x - Math.floor(R * x); 
  v = (int) (1024 * t);
  return v;
  }

 /*Este método toma un objeto ObjectPerfumeria como entrada y lo almacena en la tabla hash utilizando el método de dispersión de la multiplicación. Si la posición calculada está ocupada, se busca la siguiente posición disponible y se almacena allí.*/
  public void insert(ObjectPerfumeria newObject) {  
  int position = multiplicationMethod(newObject.getId());
  if (m[position] == null) {
    m[position] = newObject;
  } else {
    int i = 1;
    while (m[(position + i) % m.length] != null) {
      i++;
    }
    m[(position + i) % m.length] = newObject;
    }
  }
  /*Este método también toma un objeto ObjectPerfumeria como entrada, pero utiliza la cadena de texto que representa el nombre del objeto en lugar de su ID para calcular la posición en la que se debe almacenar.*/
  public void insertTwo(ObjectPerfumeria newObject) {  
  long value;
    
  value =  transformKey(newObject.getName()); 
  value = dispersion(value);
    
  int position = (int) value;
  if (m[position] == null) {
    m[position] = newObject;
  } else {
    int i = 1;
    while (m[(position + i) % m.length] != null) {
      i++;
    }
    m[(position + i) % m.length] = newObject;
    }
  }
  /*Este método recorre la tabla y muestra en consola los objetos que se almacenaron en la tabla hash*/
  public void showTable() {
    for (int i = 0; i < m.length; i++) {
      if (m[i] != null) {
        System.out.println("[" + i + "]: "+ "PRODUCTO: " + m[i].getName() + "  PRECIO: " + Math.round(m[i].getPrice()) + " (ID: " + m[i].getId() + ")");
      }
    }
  }
  
}