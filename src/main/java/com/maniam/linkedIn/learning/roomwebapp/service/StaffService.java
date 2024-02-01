package com.maniam.linkedIn.learning.roomwebapp.service;

import com.maniam.linkedIn.learning.roomwebapp.data.StaffRepository;
import com.maniam.linkedIn.learning.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() { return staffRepository.findAll(); }
}
