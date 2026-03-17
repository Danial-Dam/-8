class ExternalLogisticsServiceC {
    public void process(String id) {
        System.out.println("ServiceC processing " + id);
    }

    public String status(String id) {
        return "ServiceC status: " + id;
    }
}

class LogisticsAdapterC implements IInternalDeliveryService {
    private ExternalLogisticsServiceC service = new ExternalLogisticsServiceC();

    @Override
    public void deliverOrder(String orderId) {
        service.process(orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return service.status(orderId);
    }
}