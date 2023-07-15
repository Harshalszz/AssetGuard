package com.internship.EarlyWarningSystem.virtualSensors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VirtualSensorRepository extends JpaRepository<VirtualSensor, Integer> {
}
