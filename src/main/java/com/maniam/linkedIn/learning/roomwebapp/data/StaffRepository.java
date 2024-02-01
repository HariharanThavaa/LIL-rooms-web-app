package com.maniam.linkedIn.learning.roomwebapp.data;

import com.maniam.linkedIn.learning.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, Long> {
}
