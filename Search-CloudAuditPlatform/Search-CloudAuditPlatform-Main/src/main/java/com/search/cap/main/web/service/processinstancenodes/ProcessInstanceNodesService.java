package com.search.cap.main.web.service.processinstancenodes;
import com.search.cap.main.web.dao.ProcessInstanceNodesDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;@Service
@Slf4j
public class ProcessInstanceNodesService {
@Autowired
private ProcessInstanceNodesDao processinstancenodesDao;

}