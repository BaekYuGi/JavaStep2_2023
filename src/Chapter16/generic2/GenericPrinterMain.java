package Chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		//방법1
		GenericPrinter<Powder> printerPowder = new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		System.out.println(powder);

		powder.doPrinting();
		
		GenericPrinter<Plastic> printerPlastic = new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic.getMaterial());
		plastic.doPrinting();
		
		Water water = new Water();
		water.doPrinting();
		
		/*
		//물의 재료는 허용되면 안되지만 제너릭의 특성상 허용하는 모순이 발생한다
		GenericPrinter<Water> printerWater = new GenericPrinter<Water>();
		printerWater.setMaterial(new Water());
		System.out.println(printerWater.getMaterial());
		
		*/
	}

}
