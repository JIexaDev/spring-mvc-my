package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceIml implements CarService {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(1, "model_1", 1111));
        carList.add(new Car(2, "model_2", 2222));
        carList.add(new Car(3, "model_3", 3333));
        carList.add(new Car(4, "model_4", 4444));
        carList.add(new Car(5, "model_5", 5555));
    }

    @Override
    public List<Car> getListCar(int count) {
        return carList.subList(0, count+1);
    }
}
