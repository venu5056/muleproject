# muleproject
How to Consume SOAP service with multi-part(message contains multiple parts) WSDL using Mule ESB.
Componants used:
1.CXF as JAX-WS client
2.SOAP Router
3.XML to JAXBObject transformer
4.WSDL2Java tool by CXF can be found at below link. http://cxf.apache.org/download.html
when using a document style SOAP binding for an operation with messages (input, output, or fault) that are defined with multiple parts, when using a document style SOAP binding for an operation with messages (input, output, or fault) that are defined with multiple parts, all parts other than the one selected to be bound to the SOAP body must be bound as attachments or headers.
Read more about multipart wsdl in below link.
https://www.ibm.com/support/knowledgecenter/SSTLXK_7.5.1/com.ibm.wbpm.main.doc/topics/cadm_wsdlstyle.html
Whenever you try consuming servi ces with multi-part messages , webservice consumer shows warning as “Warning: Operation Messages With More Than 1 Part Are Not Supported.”
When you drag and drop DW componant it senses either SOAP Body or Other parts, which makes it difficult for developers to  perform transformations.
Step 1: Generate JaxB Objects corrosponds to given service WSDL.
Before generating JAXB objects we need to make below change to WSDL.

