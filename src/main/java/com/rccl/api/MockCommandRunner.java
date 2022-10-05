package com.rccl.api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rccl.api.entity.Account;
import com.rccl.api.entity.Transcript;
import com.rccl.api.entity.account.ContactInformation;
import com.rccl.api.entity.account.LoyaltyInformation;
import com.rccl.api.entity.account.LoyaltyInformation.CaptainsClubLoyaltyTierEnum;
import com.rccl.api.entity.account.LoyaltyInformation.CelebrityBlueChipLoyaltyTierEnum;
import com.rccl.api.entity.account.LoyaltyInformation.ClubRoyaleLoyaltyTierEnum;
import com.rccl.api.entity.account.LoyaltyInformation.CrownandAnchorSocietyLoyaltyTierEnum;
import com.rccl.api.entity.account.PersonalInformation;
import com.rccl.api.entity.transcript.TranscriptBody;
import com.rccl.api.respository.AccountRepository;
import com.rccl.api.respository.TranscriptRepository;

@Component
public class MockCommandRunner implements CommandLineRunner {

	@Autowired
	TranscriptRepository transcriptRepository;

	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SimpleCommand");
		LocalDateTime currentDateTime = LocalDateTime.now();
		List<TranscriptBody> transcriptBodyList = new ArrayList<TranscriptBody>();
		for (int i = 1; i < 5; i++) {
			TranscriptBody transcriptBody = new TranscriptBody(currentDateTime.plusSeconds(i), "Test Source",
					"New Message " + i);
			transcriptBodyList.add(transcriptBody);
		}
		for (int i = 1; i <= 3; i++) {
			Transcript transcript = new Transcript("Transcript" + i, currentDateTime, transcriptBodyList);
			transcriptRepository.save(transcript);
		}

//Mock values for Account

		ContactInformation contactInformation = new ContactInformation("janedoe@gmail.com", "5555555555", "5555555556");
		PersonalInformation personalInformation = new PersonalInformation(currentDateTime, "Jane", "Doe", "Jillian");
		LoyaltyInformation loyaltyInformation = new LoyaltyInformation("8675309",
				CrownandAnchorSocietyLoyaltyTierEnum.DIAMOND_PLUS, "8675309", CaptainsClubLoyaltyTierEnum.ZENITH,
				"8675309", "8675309", ClubRoyaleLoyaltyTierEnum.MASTERS, "8675309",
				CelebrityBlueChipLoyaltyTierEnum.AMETHYST);
		Account account = new Account("G1234567", "98765432", contactInformation, loyaltyInformation,
				personalInformation, "5555555556", "EMAIL");
		accountRepository.save(account);
	}

}
