public class PlanoDeOperadora {
    public static void main(String[] args) {
		String plano = "T"; // Basico / Medio / Turbo

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}

		}
	}
}