package com.aws.codestar.projecttemplates.suppot;

public class MailTemplatesUtils {
	public String bulid(String userName ,String userEmail,String url) {
		return "<table align='center' bgcolor='#FFFFFF' border='0' cellpadding='0' cellspacing='0' width='100%' data-darkreader-inline-bgcolor='' style='--darkreader-inline-bgcolor:#1c1c1a;'>"+
				"    <tbody>"+
				"        <tr>"+
				"            <td class='m_-5272026705015238311mobile-padding' style='padding: 50px 30px 60px; border-left: 1px solid rgb(218, 218, 218); border-right: 1px solid rgb(218, 218, 218); border-bottom: 1px solid rgb(218, 218, 218); --darkreader-inline-border-left:#423f39; --darkreader-inline-border-right:#423f39; --darkreader-inline-border-bottom:#423f39;' data-darkreader-inline-border-left='' data-darkreader-inline-border-right='' data-darkreader-inline-border-bottom=''>"+
				"                <table border='0' cellpadding='0' cellspacing='0'>"+
				"                    <tbody>"+
				"                        <tr>"+
				"                            <td style='padding: 0px; font-size: 18px; color: rgb(102, 116, 126); line-height: 28px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#d4c7af;' data-darkreader-inline-color=''>親愛的 "+userName+",</td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td style='padding: 20px 0px 0px; font-size: 18px; color: rgb(102, 116, 126); line-height: 28px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#d4c7af;' data-darkreader-inline-color=''>歡迎來到BBM，感謝您創建帳戶！</td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td style='padding: 20px 0px 0px; font-size: 18px; color: rgb(102, 116, 126); line-height: 28px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#d4c7af;' data-darkreader-inline-color=''>在開始使用BBM之前，我們需要確認用於創建此帳戶的電子郵件地址。請點擊下方確認您的電子郵件。"+
				"                            </td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td>"+
				"                                <table align='left' border='0' cellpadding='0' cellspacing='0' class='m_-5272026705015238311responsive-table' width='100%'>"+
				"                                    <tbody>"+
				"                                        <tr>"+
				"                                            <td align='left' class='m_-5272026705015238311mobile-button-wrapper' style='padding:20px 0 0 0'>"+
				"                                                <table border='0' cellpadding='0' cellspacing='0' class='m_-5272026705015238311responsive-table'>"+
				"                                                    <tbody>"+
				"                                                        <tr>"+
				"                                                            <td align='center' bgcolor='#71A865' style='border-radius: 3px; --darkreader-inline-bgcolor:#505b40;' data-darkreader-inline-bgcolor=''>"+
				"                                                                <a class='m_-5272026705015238311mobile-button' href='"+url+"' style='font-size: 16px; line-height: 22px; font-family: Calibri, Helvetica, sans-serif; color: rgb(255, 255, 255); text-decoration: none; border-radius: 3px; padding: 12px 25px; border: 1px solid rgb(113, 168, 101); display: inline-block; --darkreader-inline-color:#fffff9; --darkreader-inline-border-top:#5c6949; --darkreader-inline-border-right:#5c6949; --darkreader-inline-border-bottom:#5c6949; --darkreader-inline-border-left:#5c6949;' title='Confirm email' target='_blank' data-saferedirecturl='https://www.google.com/url?q=https://accounts.home.sophos.com/confirm/4loSRJG1k54QmfYpaEZvIFIwNUDqehSFHb353xidYdCVAf6CJ7/j9NurXWn9xQnzJ1lK4e7DCGAhvXqEClnimA&amp;source=gmail&amp;ust=1556610884685000&amp;usg=AFQjCNGPvzZfAMLzmgx51DG9xwiq03hdFg' data-darkreader-inline-color='' data-darkreader-inline-border-top='' data-darkreader-inline-border-right='' data-darkreader-inline-border-bottom='' data-darkreader-inline-border-left=''><span class='il'>確認</span> <span class='il'>email</span></a>"+
				"                                                            </td>"+
				"                                                        </tr>"+
				"                                                    </tbody>"+
				"                                                </table>"+
				"                                            </td>"+
				"                                        </tr>"+
				"                                    </tbody>"+
				"                                </table>"+
				"                            </td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td style='padding: 20px 0px 0px; font-size: 18px; color: rgb(102, 116, 126); line-height: 28px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#d4c7af;' data-darkreader-inline-color=''>感謝您</td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td style='padding: 20px 0px 0px; font-size: 18px; color: rgb(42, 125, 192); line-height: 28px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#a3b8bd;' data-darkreader-inline-color=''><strong>BBM維護小組</strong></td>"+
				"                        </tr>"+
				"                        <tr>"+
				"                            <td style='padding: 20px 0px 0px; font-size: 14px; color: rgb(127, 139, 147); line-height: 22px; font-family: Calibri, Helvetica, sans-serif; text-align: left; --darkreader-inline-color:#cfc2a9;' data-darkreader-inline-color=''>這封<span class='il'>電子郵件</span>由BBM自動發送至 "+userEmail+"如果您未創建此帳戶，請忽略此電子郵件，不要點擊任何鏈接。</td>"+
				"                        </tr>"+
				"                    </tbody>"+
				"                </table>"+
				"            </td>"+
				"        </tr>"+
				"    </tbody>"+
				"</table>";
	}
}
