class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA service = new ExternalLogisticsServiceA();

    @Override
    public void deliverOrder(String orderId) {
        try {
            service.shipItem(Integer.parseInt(orderId));
        } catch (Exception e) {
            System.out.println("Error in AdapterA: " + e.getMessage());
        }
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return service.trackShipment(Integer.parseInt(orderId));
    }
}