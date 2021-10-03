package com.hlp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlp.pojo.DocumentDetails;
import com.hlp.repository.DocumentDetailsRepository;
@Service
@Transactional
public class DocumentuploadServiceImp implements DocumentuploadService  {
	@Autowired
	DocumentDetailsRepository docrepo;
	@Override
	public boolean addDocumentDetails(DocumentDetails docdetails) {
		return docrepo.addDocumentDetails(docdetails);
	}

	@Override
	public boolean updateDocumentDetails(DocumentDetails docdetails) {
		return docrepo.updateDocumentDetails(docdetails);
	}

	@Override
	public boolean deleteDocumentDetails(DocumentDetails docdetails) {
		return docrepo.deleteDocumentDetails(docdetails);
	}

	@Override
	public List<DocumentDetails> getDocumentDetails() {
		return docrepo.getDocumentDetails();
	}
	
}
