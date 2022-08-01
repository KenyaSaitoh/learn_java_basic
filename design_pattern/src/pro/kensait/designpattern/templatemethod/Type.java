package pro.kensait.designpattern.templatemethod;

enum DeliveryType {
    REGULAR, COOL, GOLF, LETTER;
}

enum ParcelType {
    SMALL, MEDIUM, LARGE;
}

enum RegionType1 {
    HOKKAIDO, TOHOKU, KANTO, CHUBU, KANSAI, CHUGOKU, SHIKOKU, KYUSHU, OKINAWA;
}

enum RegionType {
    HOKKAIDO, HONSHU, SHIKOKU, KYUSHU, OKINAWA;
    public int getDistance(RegionType to) {
        int distance = 1;
        if (this == HOKKAIDO && to != HOKKAIDO) distance += 2;
        if (this == OKINAWA && to != OKINAWA) distance += 3;
        if (this != OKINAWA && to == OKINAWA) distance += 3;
        return distance;
    }
}

enum CustomerType {
    GENERAL, PREMIUM;
}