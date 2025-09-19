package ie.setu;

class HotelRoomQ4 {
    private int roomNumber;
    private String roomType;
    private boolean isVacant;
    private double rate;

    public HotelRoomQ4() {
        return;
    }

    public HotelRoomQ4(int roomN, String roomT) {
        setRoomNumber(roomN);
        setRoomType(roomT);
    }

    public HotelRoomQ4(int roomN, String roomT, boolean isV, double rate2) {
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

    public void setIsVacant(boolean isV) {
        isVacant = isV;
    }

    public boolean getIsVacant() {
        return isVacant;
    }

    public void setRate(double rate2) {
        rate = rate2;
    }

    public double getRate() {
        return rate;
    }

    public void isOccupied() {
        if (isVacant) {
            System.out.println("This room is occupied");
        } else {
            setIsVacant(true);
            System.out.println("This room is now occupied");
        }
    }

    public String toString() {
        return "Room number: " + getRoomType() + ", Room type: " + getRoomNumber() + ", Occupied: " + getIsVacant() + ", Rate: " + getRate();
    }
}
