import java.awt.Color;

public class Main {
   public static void main(String[] args) {
    
   }
}

public enum TipoDePrenda{
   ZAPATO, CAMISA_MANGA_CORTA, PANTALON;
}

public enum Material{
   ALGODON, LINO, SEDA, NYLON;
}

public enum Categoria{
   PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS;
}

class Prenda{
   TipoDePrenda tipoPrenda;
   Material material;
   Color color; // RGB

   public Prenda(TipoDePrenda tipoPrenda, Material material, Color color){
      if(material==null || tipoPrenda==null || color==null){
         throw new NullPointerException();
      }
      this.tipoPrenda = tipoPrenda;
      this.material = material;
      this.color = color;
   }
  
   public Prenda(TipoDePrenda tipoPrenda, Material material, Color color, Color colorSecundario){
      if(material==null || tipoPrenda==null || color==null){
         throw new NullPointerException();
      }
      this.tipoPrenda = tipoPrenda;
      this.material = material;
      this.color = color;
      this.color = colorSecundario;
   }
  
   public Categoria categoria() = tipoPrenda.categoria();
  
}

class TipoDePrenda{
   Categoria categoria
   TipoDePrenda(Categoria categoria){
      if(categoria==null){
         throw new NullPointerException();
      }
      this.categoria = categoria
   }
   public Categoria categoria() = this.categoria
}
