package com.digitalinnovation.one.meeting.repository;

import com.digitalinnovation.one.meeting.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
