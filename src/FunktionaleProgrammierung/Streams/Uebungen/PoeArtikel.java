/*      Ein Artikel enthält die Artikelnummer, den Preis, die Warengruppe und den Lagerbestand.

        Erzeugen Sie eine Liste mehrerer Artikel-Objekte und geben Sie alle Artikel,
        die zu einer bestimmten Warengruppe gehören und deren Lagerbestand eine bestimmte Menge übersteigt,
        am Bildschirm aus. Nutzen Sie hierzu mehrfach die Stream-Methode filter.*/

package FunktionaleProgrammierung.Streams.Uebungen;

import java.util.Arrays;
import java.util.List;

public class PoeArtikel {

        public static void main(String[] args) {
            // Artikel-Objekte erzeugen
            Article artikel1 = new Article(1, 100.0, "Elektronik", 10);
            Article artikel2 = new Article(2, 50.0, "Bücher", 5);
            Article artikel3 = new Article(3, 20.0, "Kleidung", 30);
            Article artikel4 = new Article(4, 150.0, "Elektronik", 20);
            Article artikel5 = new Article(5, 10.0, "Bücher", 15);
            Article artikel6 = new Article(6, 80.0, "Kleidung", 25);

            // Liste von Artikel-Objekten erzeugen
            List<Article> articles = Arrays.asList(artikel1, artikel2, artikel3, artikel4, artikel5, artikel6);

            // Warengruppe und Mindestlagerbestand festlegen
            String targetCategory = "Elektronik";
            int targetStock = 15;

            // Artikel filtern und ausgeben
            System.out.println("Artikel mit Warengruppe " + targetCategory + " und Lagerbestand über " + targetStock + ":");
            articles.stream()
                    .filter(a -> a.getCategory().equals(targetCategory))
                    .filter(a -> a.getStock() > targetStock)
                    .forEach(System.out::println);
        }
    }

    class Article {
        private int number;
        private double price;
        private String category;
        private int stock;

        public Article(int number, double price, String category, int stock) {
            this.number = number;
            this.price = price;
            this.category = category;
            this.stock = stock;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "number=" + number +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    ", stock=" + stock +
                    '}';
        }
    }
