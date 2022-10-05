package com.rccl.api.entity.account;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

@Data
public class LoyaltyInformation {

	private String crownAndAnchorId;

	public enum CrownandAnchorSocietyLoyaltyTierEnum {
		PRE_GOLD, GOLD, PLATINUM, EMERALD, DIAMOND, DIAMOND_PLUS, PINNACLE_CLUB
	}

	private CrownandAnchorSocietyLoyaltyTierEnum crownandAnchorSocietyLoyaltyTier;

	private String captainsClubId;

	public enum CaptainsClubLoyaltyTierEnum {
		PREVIEW, CLASSIC, SELECT, ELITE, ELITE_PLUS, ZENITH
	}

	private CaptainsClubLoyaltyTierEnum captainsClubLoyaltyTier;

	private String azamaraLoyaltyId;
	private String clubRoyaleId;

	public enum ClubRoyaleLoyaltyTierEnum {
		CHOICE, PRIME, SIGNATURE, MASTERS
	}

	private ClubRoyaleLoyaltyTierEnum clubRoyaleLoyaltyTier;

	private String celebrityBlueChipId;

	public enum CelebrityBlueChipLoyaltyTierEnum {
		PEARL, ONYX, AMETHYST, SAPPHIRE, RUBY
	}

	private CelebrityBlueChipLoyaltyTierEnum celebrityBlueChipLoyaltyTier;

	public void setCaptainsClubId(String captainsClubId) {

		this.captainsClubId = captainsClubId;
	}

	public void setAzamaraLoyaltyId(String azamaraLoyaltyId) {
		
			this.azamaraLoyaltyId = azamaraLoyaltyId;
		} 
	

	public void setCrownAndAnchorId(String crownAndAnchorId) {
		
			this.crownAndAnchorId = crownAndAnchorId;
		
	}

	public void setClubRoyaleId(String clubRoyaleId) {
		
			this.clubRoyaleId = clubRoyaleId;
		

	}

	public void setCelebrityBlueChipId(String celebrityBlueChipId) {
		
			this.celebrityBlueChipId = celebrityBlueChipId;
		
	}

	public CrownandAnchorSocietyLoyaltyTierEnum getCrownandAnchorSocietyLoyaltyTier() {
		return crownandAnchorSocietyLoyaltyTier;
	}

	public void setCrownanndAnchorSocietyLoyaltyTier(
			CrownandAnchorSocietyLoyaltyTierEnum crownandAnchorSocietyLoyaltyTier) {
		this.crownandAnchorSocietyLoyaltyTier = crownandAnchorSocietyLoyaltyTier;
	}

	public CaptainsClubLoyaltyTierEnum getCaptainsClubLoyaltyTier() {
		return this.captainsClubLoyaltyTier;
	}

	public void setCaptainsClubLoyaltyTier(CaptainsClubLoyaltyTierEnum captainsClubLoyaltyTier) {
		this.captainsClubLoyaltyTier = captainsClubLoyaltyTier;
	}

	public ClubRoyaleLoyaltyTierEnum getClubRoyaleLoyaltyTier() {
		return clubRoyaleLoyaltyTier;
	}

	public void setClubRoyaleLoyaltyTier(ClubRoyaleLoyaltyTierEnum clubRoyaleLoyaltyTier) {
		this.clubRoyaleLoyaltyTier = clubRoyaleLoyaltyTier;
	}

	public CelebrityBlueChipLoyaltyTierEnum getCelebrityBlueChipLoyaltyTier() {
		return celebrityBlueChipLoyaltyTier;
	}

	public void setCelebrityBlueChipLoyaltyTier(CelebrityBlueChipLoyaltyTierEnum celebrityBlueChipLoyaltyTier) {
		this.celebrityBlueChipLoyaltyTier = celebrityBlueChipLoyaltyTier;
	}

	public String getCrownAndAnchorId() {
		return crownAndAnchorId;
	}

	public String getCaptainsClubId() {
		return captainsClubId;
	}

	public String getAzamaraLoyaltyId() {
		return azamaraLoyaltyId;
	}

	public String getClubRoyaleId() {
		return clubRoyaleId;
	}

	public String getCelebrityBlueChipId() {
		return celebrityBlueChipId;
	}

	public LoyaltyInformation(String crownAndAnchorId,
			CrownandAnchorSocietyLoyaltyTierEnum crownanndAnchorSocietyLoyaltyTier, String captainsClubId,
			CaptainsClubLoyaltyTierEnum captainsClubLoyaltyTier, String azamaraLoyaltyId, String clubRoyaleId,
			ClubRoyaleLoyaltyTierEnum clubRoyaleLoyaltyTier, String celebrityBlueChipId,
			CelebrityBlueChipLoyaltyTierEnum celebrityBlueChipLoyaltyTier) {
		super();
		this.crownAndAnchorId = crownAndAnchorId;
		this.crownandAnchorSocietyLoyaltyTier = crownanndAnchorSocietyLoyaltyTier;
		this.captainsClubId = captainsClubId;
		this.captainsClubLoyaltyTier = captainsClubLoyaltyTier;
		this.azamaraLoyaltyId = azamaraLoyaltyId;
		this.clubRoyaleId = clubRoyaleId;
		this.clubRoyaleLoyaltyTier = clubRoyaleLoyaltyTier;
		this.celebrityBlueChipId = celebrityBlueChipId;
		this.celebrityBlueChipLoyaltyTier = celebrityBlueChipLoyaltyTier;
	}

	public LoyaltyInformation() {

	}

	/*public boolean isNumeric(String string) {
	
		 if (string == null) {
		        return false;
		    }
		    try {
		        double d = Double.parseDouble(string);
		    } catch (NumberFormatException nfe) {
		        return false;
		    }
		    return true;
}*/
}