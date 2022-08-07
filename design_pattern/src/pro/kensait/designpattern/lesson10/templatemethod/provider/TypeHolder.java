package pro.kensait.designpattern.lesson10.templatemethod.provider;

public class TypeHolder {
    public enum DeliveryType {
        REGULAR, COOL, GOLF, LETTER;
    }

    public enum ParcelType {
        SMALL, MEDIUM, LARGE;
    }

    public enum RegionType1 {
        HOKKAIDO, TOHOKU, KANTO, CHUBU, KANSAI, CHUGOKU, SHIKOKU, KYUSHU, OKINAWA;
    }

    public enum RegionType {
        HOKKAIDO, HONSHU, SHIKOKU, KYUSHU, OKINAWA;

        public int getDistance(RegionType to) {
            int distance = 1;
            if (this == HOKKAIDO && to != HOKKAIDO)
                distance += 2;
            if (this == OKINAWA && to != OKINAWA)
                distance += 3;
            if (this != OKINAWA && to == OKINAWA)
                distance += 3;
            return distance;
        }
    }

    public enum CustomerType {
        GENERAL, PREMIUM;
    }
}