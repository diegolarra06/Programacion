public class Ejercicio3 {
  public static void main(String[] args) {
   //Declarar la variable para el ordenador de mi casa
   Computer homeComputer;
   //Asignamos o instanciamos en la varible anterior la instancia el ordenador de mi casa
   homeComputer= new Computer();
homeComputer.cpuName="Intel";
System.out.println("Info de homeComputer");
System.out.println(homeComputer.toString());
System.out.println(homeComputer);
System.out.println("cpuName:"+ homeComputer.cpuName
+",motherboardName: " + homeComputer.motherboardName
+", ramGB: "+homeComputer.ramGB
+",graphicCardName: "+ homeComputer.graphicCardName
+", powerSupplyWs: "+ homeComputer.powerSupplyWs);
   //Crear una instancia del ordenador del colegio
   Computer schoolComputer = new Computer();
   System.out.println("Info de schoolComputer");
   System.out.println(schoolComputer);
   System.out.println(ImprimirInformacionOrdenador(schoolComputer));
  }
 public static String ImprimirInformacionOrdenador(Computer computer) {
      String result;
      result= "cpuName:"+ computer.cpuName
+",motherboardName: " + computer.motherboardName
+", ramGB: "+computer.ramGB
+",graphicCardName: "+ computer.graphicCardName
+", powerSupplyWs: "+ computer.powerSupplyWs;
      return result;
   }
}
  
class Computer {
    String cpuName;
    String motherboardName;
    int ramGB; 
    String graphicCardName;
    int powerSupplyWs;
   
    public String toString() {
      return "Computer{" +
              "cpuName='" + cpuName + '\'' +
              ", motherboardName='" + motherboardName + '\'' +
              ", ramGB=" + ramGB +
              ", graphicCardName='" + graphicCardName + '\'' +
              ", powerSupplyWs=" + powerSupplyWs +
              '}';
   }

}


