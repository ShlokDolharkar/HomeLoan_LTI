package com.hlp.repository;

import java.util.List;

import com.hlp.pojo.DocumentDetails;

public interface DocumentDetailsRepository {
	public boolean addDocumentDetails(DocumentDetails docdetails);
	public boolean updateDocumentDetails(DocumentDetails docdetails);
	public boolean deleteDocumentDetails(DocumentDetails docdetails);
	public List<DocumentDetails > getDocumentDetails();

}
