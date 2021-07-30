package com.home.recipe;

public class RecipeVO {
		private int ROW_NUM;
		private int RECIPE_ID;
		private String RECIPE_NM_KO;
		private String SUMRY;
		private int NATION_CODE;
		private String NATION_NM;
		private int TY_CODE;
		private String COOKING_TIME;
		private String CALORIE;
		private String QNT;
		private String LEVEL_NM;
		private String IRDNT_CODE;
		private int PC_NM;
		private String IMG_URL;
		private String DET_URL;
		public int getROW_NUM() {
			return ROW_NUM;
		}
		public void setROW_NUM(int rOW_NUM) {
			ROW_NUM = rOW_NUM;
		}
		public int getRECIPE_ID() {
			return RECIPE_ID;
		}
		public void setRECIPE_ID(int rECIPE_ID) {
			RECIPE_ID = rECIPE_ID;
		}
		public String getRECIPE_NM_KO() {
			return RECIPE_NM_KO;
		}
		public void setRECIPE_NM_KO(String rECIPE_NM_KO) {
			RECIPE_NM_KO = rECIPE_NM_KO;
		}
		public String getSUMRY() {
			return SUMRY;
		}
		public void setSUMRY(String sUMRY) {
			SUMRY = sUMRY;
		}
		public int getNATION_CODE() {
			return NATION_CODE;
		}
		public void setNATION_CODE(int nATION_CODE) {
			NATION_CODE = nATION_CODE;
		}
		public String getNATION_NM() {
			return NATION_NM;
		}
		public void setNATION_NM(String nATION_NM) {
			NATION_NM = nATION_NM;
		}
		public int getTY_CODE() {
			return TY_CODE;
		}
		public void setTY_CODE(int tY_CODE) {
			TY_CODE = tY_CODE;
		}
		public String getCOOKING_TIME() {
			return COOKING_TIME;
		}
		public void setCOOKING_TIME(String cOOKING_TIME) {
			COOKING_TIME = cOOKING_TIME;
		}
		public String getCALORIE() {
			return CALORIE;
		}
		public void setCALORIE(String cALORIE) {
			CALORIE = cALORIE;
		}
		public String getQNT() {
			return QNT;
		}
		public void setQNT(String qNT) {
			QNT = qNT;
		}
		public String getLEVEL_NM() {
			return LEVEL_NM;
		}
		public void setLEVEL_NM(String lEVEL_NM) {
			LEVEL_NM = lEVEL_NM;
		}
		public String getIRDNT_CODE() {
			return IRDNT_CODE;
		}
		public void setIRDNT_CODE(String iRDNT_CODE) {
			IRDNT_CODE = iRDNT_CODE;
		}
		public int getPC_NM() {
			return PC_NM;
		}
		public void setPC_NM(int pC_NM) {
			PC_NM = pC_NM;
		}
		public String getIMG_URL() {
			return IMG_URL;
		}
		public void setIMG_URL(String iMG_URL) {
			IMG_URL = iMG_URL;
		}
		public String getDET_URL() {
			return DET_URL;
		}
		public void setDET_URL(String dET_URL) {
			DET_URL = dET_URL;
		}
		@Override
		public String toString() {
			return "RecipeVO [ROW_NUM=" + ROW_NUM + ", RECIPE_ID=" + RECIPE_ID + ", RECIPE_NM_KO=" + RECIPE_NM_KO
					+ ", SUMRY=" + SUMRY + ", NATION_CODE=" + NATION_CODE + ", NATION_NM=" + NATION_NM + ", TY_CODE="
					+ TY_CODE + ", COOKING_TIME=" + COOKING_TIME + ", CALORIE=" + CALORIE + ", QNT=" + QNT
					+ ", LEVEL_NM=" + LEVEL_NM + ", IRDNT_CODE=" + IRDNT_CODE + ", PC_NM=" + PC_NM + ", IMG_URL="
					+ IMG_URL + ", DET_URL=" + DET_URL + "]";
		}
		
		
}
