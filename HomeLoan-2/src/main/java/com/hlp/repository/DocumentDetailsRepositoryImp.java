package com.hlp.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlp.pojo.DocumentDetails;

@Repository
public class DocumentDetailsRepositoryImp implements DocumentDetailsRepository {
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addDocumentDetails(DocumentDetails docdetails) {
		eMan.persist(docdetails);
		return true;
	}

	@Override
	public boolean updateDocumentDetails(DocumentDetails docdetails) {
		eMan.merge(docdetails);
		return true;
	}

	@Override
	public boolean deleteDocumentDetails(DocumentDetails docdetails) {
		DocumentDetails obj = eMan.find(DocumentDetails.class, docdetails);
		eMan.remove(obj);
		return true;
	}

	@Override
	public List<DocumentDetails> getDocumentDetails() {
		List<DocumentDetails> ls = eMan.createQuery("from DocumentDetails").getResultList();
		return ls;
	}

}
