package bimestreTres.facadeViajes;

public class CheckFacade {

    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade(AvionAPI avionAPI, HotelAPI hotelAPI) {
        this.avionAPI = avionAPI;
        this.hotelAPI = hotelAPI;
    }


    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda,fechaVuelta,origen,destino);
        hotelAPI.buscarHoteles(fechaIda,fechaVuelta,destino);
    }
}
