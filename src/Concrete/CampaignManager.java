package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası eklendi");
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası güncellendi");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası silindi");
		
	}

	 
		 

}