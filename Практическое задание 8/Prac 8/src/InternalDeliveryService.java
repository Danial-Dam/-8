class InternalDeliveryService implements IInternalDeliveryService {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Internal delivery for order " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Delivered by Internal Service";
    }
}