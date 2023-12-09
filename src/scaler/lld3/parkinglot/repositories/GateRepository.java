package scaler.lld3.parkinglot.repositories;

import scaler.lld3.parkinglot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    private Map<Long, Gate> gates = new TreeMap<>();

    public Optional<Gate> findById(Long id) {
        if (gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
