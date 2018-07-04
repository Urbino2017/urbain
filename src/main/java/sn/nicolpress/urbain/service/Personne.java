/**
 * 
 */
package sn.nicolpress.urbain.service;

/**
 * @author ahoad
 *
 */
public class Personne {
	// Une classe POJO
	private String nomPers;
	private String prenomPers;
	private String genrePers;
	/**
	 * @return the nomPers
	 */
	public String getNomPers() {
		return nomPers;
	}
	/**
	 * @param nomPers the nomPers to set
	 */
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	/**
	 * @return the prenomPers
	 */
	public String getPrenomPers() {
		return prenomPers;
	}
	/**
	 * @param prenomPers the prenomPers to set
	 */
	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}
	/**
	 * @return the genrePers
	 */
	public String getGenrePers() {
		return genrePers;
	}
	/**
	 * @param genrePers the genrePers to set
	 */
	public void setGenrePers(String genrePers) {
		this.genrePers = genrePers;
	}
	/**
	 * @param nomPers
	 * @param prenomPers
	 * @param genrePers
	 */
	public Personne(String nomPers, String prenomPers, String genrePers) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.genrePers = genrePers;
	} 

}
