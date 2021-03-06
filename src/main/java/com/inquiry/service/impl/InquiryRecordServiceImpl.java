package com.inquiry.service.impl;

import com.inquiry.dao.InquiryRecordMapper;
import com.inquiry.model.InquiryRecord;
import com.inquiry.service.InquiryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InquiryRecordServiceImpl implements InquiryRecordService {
    @Autowired
    private InquiryRecordMapper inquiryRecordMapper;

    @Override
    public InquiryRecord findById(Long id) {
        return inquiryRecordMapper.findById(id);
    }

    @Override
    public InquiryRecord findByMap(Map<String, Object> map) {
        return inquiryRecordMapper.findByMap(map);
    }

    @Override
    public List<InquiryRecord> list(Map<String, Object> map) {
        return inquiryRecordMapper.list(map);
    }


    @Override
    public int save(InquiryRecord inquiryRecord) {
        return inquiryRecordMapper.save(inquiryRecord);
    }

    @Override
    public int update(InquiryRecord inquiryRecord) {
        return inquiryRecordMapper.update(inquiryRecord);
    }

    @Override
    public int delete(Long id) {
        return inquiryRecordMapper.delete(id);
    }



}
