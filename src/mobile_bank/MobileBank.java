package mobile_bank;

public class MobileBank {
    public static void main(){

    }
//        MobileBankAcct id = new MobileBankAcct();
//        MobileBankAcct input = new MobileBankAcct();
//        MobileBankAcct record = new MobileBankAcct();
    }

//
//    A bank operates through core banking records and institutional identifiers that track customers,
//    accounts, money movement, and regulatory compliance. These details work together as a unified digital
//    ledger to ensure every transaction is accurate, secure, and traceable.
//
//            1. Customer Profile Details (KYC Records)
//
//    Before opening an account, a bank collects Know Your Customer (KYC) details to verify who owns the funds and prevent fraud.
//            • Full Legal Name: Identifies the legal owner of the account. It must match government-issued identification to ensure compliance with anti-money laundering laws.
//• Government Identification Number: Uses unique national identifiers (such as a BVN, NIN, SSN, or Passport Number) to link a person's financial activity across the banking system.
//            • Contact Information: Includes a verified phone number, email address, and physical residential address. Banks use these to send transaction alerts, one-time passwords (OTPs), and legal notices.
//            • Biometric Data: Stores fingerprints, facial scans, or signatures. This adds a physical layer of identity verification for high-value transactions or in-branch withdrawals.
//            • Risk and Compliance Status: Tracks a customer's tax residency, occupation, and source of funds. The bank uses this to monitor for unusual activity that does not match the customer's financial profile.
//
//2. Account Details
//
//    Once a customer is verified, the bank creates one or more specific accounts to hold and manage money.
//• Account Number: A unique string of digits assigned to an individual ledger. It acts as the specific address where money is sent or withdrawn.
//            • Account Type: Defines the rules, fees, and interest rates of the account. Common types include Savings Accounts (built for storing money and earning interest), Checking/Current Accounts (built for frequent daily spending), and Fixed Deposit Accounts (built for locking funds away for higher returns).
//            • Account Currency: Specifies the denomination of the funds held (such as NGN, USD, EUR, or GBP). Multi-currency accounts maintain separate sub-ledgers for each currency.
//            • Account Status: Indicates whether the account is Active (open for all transactions), Dormant (inactive for a set period and restricted for security), or Frozen/Restricted (locked due to fraud alerts or legal orders).
//            • Account Tier or Limit: Sets the maximum daily transfer limit and maximum total balance allowed. Higher tiers require stricter identity verification.
//
//            3. Balance and Financial Figures
//
//    A bank tracks money using multiple balance types rather than a single number to prevent overdrafts and accounting errors.
//• Ledger Balance (Book Balance): The total amount of money officially recorded in the account at the end of the previous business day. It does not reflect pending transactions happening in real time.
//            • Available Balance: The exact amount of money ready to spend or withdraw right now. It equals the ledger balance minus any pending card authorizations, holds, or uncleared deposits.
//            • Pending / Lien Amount: Funds temporarily locked by the bank. This happens when a merchant authorizes a card payment that has not yet settled, or when a disputed transaction is under investigation.
//• Interest Rate and Accrued Interest: The percentage the bank pays you on savings (APY) or charges you on loans (APR). Accrued interest is calculated daily and paid out monthly or quarterly.
//• Overdraft Limit: A pre-approved credit buffer that allows the account balance to drop below zero up to a specific limit without bouncing a payment.
//
//4. Bank & Routing Identifiers
//
//    To move money between different banks locally or internationally, institutions rely on standardized routing codes.
//            • Bank Name and Institutional Code: The official name of the financial institution and its local clearing code (such as a 3-digit CBN bank code in Nigeria or a 9-digit ABA Routing Number in the US).
//            • SWIFT / BIC Code: An 8-to-11-character international code that identifies a specific bank globally. Banks use it to send wire transfers across borders.
//• IBAN (International Bank Account Number): An internationally agreed system of identifying bank accounts across national borders, primarily used in Europe, the Middle East, and parts of the Caribbean.
//            • Branch Code / Sort Code: A specific number identifying the physical branch where the account was originally domiciled.
//
//5. Transaction & Ledger Records
//
//    Every movement of money generates an immutable entry in the bank's general ledger.
//            • Transaction ID (Reference Number): A unique alphanumeric code generated for every single debit or credit. It allows banks and customers to trace a payment if a dispute or delay occurs.
//• Timestamp and Value Date: The exact date and time a transaction was initiated, alongside the Value Date, which is the date the funds officially become available or begin earning interest.
//            • Debit and Credit Entries: Banks use double-entry bookkeeping. Every transaction records a Debit (money leaving one account) and an equal Credit (money entering another account).
//            • Narration / Description: A text note explaining the purpose of the payment, the sender's name, or the merchant involved.
//
//            6. Security & Access Credentials
//
//    Banks protect account details from unauthorized access using layered digital credentials.
//• Card Details (PAN, Expiry, CVV): The 16-digit Primary Account Number, expiration date, and 3-digit security code linked to a debit or credit card. These credentials allow card networks (like Visa, Mastercard, or Verve) to route payments to your bank account.
//            • PIN (Personal Identification Number): A secret 4-to-6-digit code used to authorize ATM withdrawals, POS purchases, and mobile banking transfers.
//• Authentication Tokens & Keys: Encrypted digital certificates, passwords, and hardware/software tokens that verify your device during online banking sessions.
//
//    How All These Details Work Together
//
//    When you initiate a transfer or swipe a card, these details interact in seconds:
//            1. Authentication: You enter your PIN, password, or biometric scan to prove you own the Customer Profile.
//2. Validation: The bank checks your Account Status (to ensure it is active) and your Available Balance (to confirm you have enough funds).
//            3. Routing: Using the recipient's Account Number and Bank/Routing Code, the payment network locates the receiving institution.
//            4. Ledger Update: Your bank places a temporary Hold on the funds, deducts the amount via a Debit entry, generates a Transaction ID, and sends a settlement message to the receiving bank to post a Credit entry.
//
