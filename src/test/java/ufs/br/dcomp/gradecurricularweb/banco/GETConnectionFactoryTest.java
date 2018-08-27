package ufs.br.dcomp.gradecurricularweb.banco;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

import br.ufs.dcomp.gradecurricularweb.util.ConnectionFactory;

public class GETConnectionFactoryTest {
	Connection conn;

	@Test
	public final void testGetConnection() {
		conn = ConnectionFactory.getConnection();
		
		assertNotNull(conn);
	}
}
