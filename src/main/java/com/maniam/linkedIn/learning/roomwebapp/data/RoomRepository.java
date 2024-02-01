package com.maniam.linkedIn.learning.roomwebapp.data;

import com.maniam.linkedIn.learning.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
