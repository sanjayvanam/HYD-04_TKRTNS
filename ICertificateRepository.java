/*Created by-Sanjay Kumar Vanam
 * Date Created-24/11/2023
*/

package com.tns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.Certificate;

public interface ICertificateRepository extends JpaRepository<Certificate,Long>{
	Certificate addCertificate(Certificate Certificate);
	Certificate updateCertificate(Certificate Certificate);
	Certificate searchCertificate(long id);
	Certificate deleteCertificate(long id);
	

}
