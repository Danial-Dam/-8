class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("ServiceA shipping item " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "ServiceA tracking #" + shipmentId;
    }
}