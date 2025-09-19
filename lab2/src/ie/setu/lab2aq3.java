package ie.setu;

class HotelRoomQ3 {
    private int roomNumber;
    private String roomType;
    private int isVacant;
    private double rate;

    public HotelRoomQ3() {
        return;
    }

    public HotelRoomQ3(int roomN, String roomT) {
        setRoomNumber(roomN);
        setRoomType(roomT);
    }

    public HotelRoomQ3(int roomN, String roomT, int isV, double rate2) {
        setRoomNumber(roomN);
        setRoomType(roomT);
        setIsVacant(isV);
        setRate(rate2);
    }

    public void setRoomNumber(int roomN) {
        roomNumber = roomN;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomType(String roomT) {
        roomType = roomT;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setIsVacant(int isV) {
        isVacant = isV;
    }

    public int getIsVacant() {
        return isVacant;
    }

    public void setRate(double rate2) {
        rate = rate2;
    }

    public double getRate() {
        return rate;
    }

    public String toString() {
        return "Room number: " + getRoomType() + ", Room type: " + getRoomNumber() + ", Occupied: " + getIsVacant() + ", Rate: " + getRate();
    }
}
