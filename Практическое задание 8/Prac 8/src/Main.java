public class Main {
    public static void main(String[] args) {

        // ===== DECORATOR =====
        System.out.println("=== REPORT SYSTEM ===");

        IReport report = new SalesReport();


        report = new DateFilterDecorator(report);
        report = new SortingDecorator(report);
        report = new AmountFilterDecorator(report);
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());


        System.out.println("\n=== DELIVERY SYSTEM ===");

        IInternalDeliveryService service;

        service = DeliveryServiceFactory.getService("internal");
        service.deliverOrder("101");
        System.out.println(service.getDeliveryStatus("101"));

        service = DeliveryServiceFactory.getService("A");
        service.deliverOrder("102");
        System.out.println(service.getDeliveryStatus("102"));

        service = DeliveryServiceFactory.getService("B");
        service.deliverOrder("103");
        System.out.println(service.getDeliveryStatus("103"));

        service = DeliveryServiceFactory.getService("C");
        service.deliverOrder("104");
        System.out.println(service.getDeliveryStatus("104"));
    }
}