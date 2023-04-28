// Hice solo la primera parte, las otras están en proceso xd

import java.awt.Color;

public class Main {
   public static void main(String[] args) {
    
   }
}

public enum TipoDePrenda{
   ZAPATO, CAMISA_MANGA_CORTA, PANTALON
}

public enum Material{
   ALGODON, LINO, SEDA, NYLON
}

public enum Categoria{
   PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS
}

public enum Trama{
   LISA, RAYADA, CON_LUNARES, A_CUADROS, ESTAMPADO
}

class Prenda{
   private TipoDePrenda tipoPrenda;
   private Material material;
   private Color color; // RGB
   private Color colorSecundario;
   private Trama trama;

   public Prenda(TipoDePrenda tipoPrenda, Material material, Color color, Trama trama){
      if(material==null || tipoPrenda==null || color==null || trama==null){
         throw new NullPointerException();
      }
      this.tipoPrenda = tipoPrenda;
      this.material = material;
      this.color = color;
      this.trama = trama;
   }
  
   public Prenda(TipoDePrenda tipoPrenda, Material material, Color color, Color colorSecundario, Trama trama){
      if(material==null || tipoPrenda==null || color==null || colorSecundario==null || trama == null){
         throw new NullPointerException();
      }
      this.tipoPrenda = tipoPrenda;
      this.material = material;
      this.color = color;
      this.color = colorSecundario;
      this.trama = trama;
   }
  
   public Categoria categoria() = tipoPrenda.categoria();
  
}

class TipoDePrenda{
   private Categoria categoria;
   public TipoDePrenda(Categoria categoria){
      if(categoria==null){
         throw new NullPointerException();
      }
      this.categoria = categoria
   }
   public Categoria categoria() = this.categoria
}
